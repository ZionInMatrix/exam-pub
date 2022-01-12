package com.example.exampub.services;

import com.example.exampub.rest.models.UserRest;
import com.example.exampub.rest.models.UserWithOrdersRest;

import java.util.List;

public interface UserService {

    List<UserRest> getAllUsers();

    UserWithOrdersRest getUserWithOrdersByID(Integer id);

}
