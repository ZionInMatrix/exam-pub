package com.example.exampub.services.implementations;

import com.example.exampub.convertors.DrinkMenuConvertor;
import com.example.exampub.repositories.DrinkMenuRepository;
import com.example.exampub.rest.models.DrinkMenuRest;
import com.example.exampub.services.DrinkMenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrinkMenuServiceImpl implements DrinkMenuService {

    private static final Logger logger = LogManager.getLogger(DrinkMenuServiceImpl.class);

    @Autowired
    private DrinkMenuRepository drinkMenuRepository;

    @Autowired
    private DrinkMenuConvertor drinkMenuConvertor;


    @Override
    public List<DrinkMenuRest> getAllDrinks() {
        logger.info("Get all Drinks");

        return null;
    }
}
