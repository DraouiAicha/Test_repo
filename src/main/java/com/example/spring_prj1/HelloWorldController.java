package com.example.spring_prj1;

import com.example.spring_prj1.com.persons.CreatePerson;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private CreatePerson createPerson;
    @RequestMapping(method = RequestMethod.POST, path = "/createPerson")
    public String helloWorld(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname, @PathParam("city") String city) {
        return createPerson.createUser(firstname, lastname, city);
    }
}
