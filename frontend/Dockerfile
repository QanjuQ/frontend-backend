FROM node:8-alpine
WORKDIR /usr/app/
COPY ./package.json .
RUN npm install
COPY ./index.js .
EXPOSE 8000
CMD [ "npm", "start" ]
