package com.example.exampub.rest.controllers;

import com.example.exampub.rest.models.DrinkMenuRest;
import com.example.exampub.rest.models.UserRest;
import com.example.exampub.services.DrinkMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrinkMenuController {

    @Autowired
    private DrinkMenuService drinkMenuService;

    @RequestMapping(value = "/drink-menu", method = RequestMethod.GET)
    private List<DrinkMenuRest> getAllDrinks() {
        return drinkMenuService.getAllDrinks();
    }
}
