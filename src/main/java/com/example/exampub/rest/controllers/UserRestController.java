package com.example.exampub.rest.controllers;

import com.example.exampub.rest.models.UserRest;
import com.example.exampub.rest.models.UserWithOrdersRest;
import com.example.exampub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    private List<UserRest> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    private UserWithOrdersRest getUserWithOrdersByID(@PathVariable("id") Integer id) {
        return userService.getUserWithOrdersByID(id);
    }

}
