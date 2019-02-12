const express = require("express");
const request = require("request");
const bodyParser = require('body-parser');

const PORT = 8000;
const baseurl = process.env.BACKEND_URL;

const logger = (req, res, next) => {
  console.log(req.url, req.method);
  next();
};

const callback = (res) => (error, response, body) => {
  if (error) {
    return console.error('upload failed:', error);
  }
  res.send(body);
};

const createOptions = (req) => ({
  method: req.method,
  url: `${baseurl}${req.url}`,
  json: { id: "123" }
});

const forward = (req, res) => request(createOptions(req), callback(res));

let app = express();

app.use(bodyParser.json());
app.use(logger);
app.all('*', forward);

app.listen(PORT, () => console.log(`MAGIC happens at ${PORT}`));


