package com.docker.assignment;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";

    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String todo(){
        return "todos";
    }



    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public String todo(@RequestBody String todo){
        return "Updated the todo";
    }

}
