package com.example.spring_prj1;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld(@PathParam("message") String message, @PathParam("name") String name) {
        return new HelloWorld(message, name).toString();
    }
}
