package com.example.exampub.services;

import com.example.exampub.rest.models.DrinkMenuRest;
import com.example.exampub.rest.models.UserRest;

import java.util.List;

public interface DrinkMenuService {

    List<DrinkMenuRest> getAllDrinks();

}
