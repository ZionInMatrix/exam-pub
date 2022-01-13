package com.example.exampub.convertors;

import com.example.exampub.entity.DrinkMenu;
import com.example.exampub.rest.models.DrinkMenuRest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DrinkMenuConvertor {
    public List<DrinkMenuRest> toRest(List<DrinkMenu> allDrinks) {
        List<DrinkMenuRest> drinkMenuList = new ArrayList<>();
        for (DrinkMenu drinkMenu : allDrinks) {
            drinkMenuList.add(toRest(drinkMenu));
        }
        return drinkMenuList;
    }

    public DrinkMenuRest toRest(DrinkMenu drinkMenu) {
        DrinkMenuRest rest = new DrinkMenuRest();
        rest.setId(drinkMenu.getId());
        rest.setProductName(drinkMenu.getProductName());
        rest.setPrice(drinkMenu.getPrice());
        rest.setIsForAdult(drinkMenu.getIsForAdult());
        return rest;
    }
}
