package com.example.exampub.services.implementations;

import com.example.exampub.rest.models.UserRest;
import com.example.exampub.services.ValidationService;
import com.example.exampub.services.exceptions.ValidationServiceException;
import org.springframework.stereotype.Component;

@Component
public class ValidationServiceImpl implements ValidationService {

    @Override
    public void validate(UserRest user) {

        if (user.getIsAdult() < 18) {
            throw new ValidationServiceException("No legal age for alcohol product");

        }
        if (user.getPocket() < 2) {
            throw new ValidationServiceException("You don't have enough money");
        }
    }
}
