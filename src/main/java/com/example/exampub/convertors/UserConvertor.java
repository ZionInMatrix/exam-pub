package com.example.exampub.convertors;

import com.example.exampub.entity.User;
import com.example.exampub.rest.models.UserRest;
import com.example.exampub.rest.models.UserWithOrdersRest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConvertor {
    public List<UserRest> toRest(List<User> allUsers) {
        List<UserRest> userList = new ArrayList<>();
        for (User users : allUsers) {
            userList.add(toRest(users));
        }
        return userList;
    }

    public UserRest toRest(User dao) {
        UserRest rest = new UserRest();
        rest.setId(dao.getId());
        rest.setName(dao.getName());
        rest.setIsActive(dao.getIsActive());
        rest.setIsAdult(dao.getIsAdult());
        rest.setPocket(dao.getPocket());
        return rest;
    }

    public UserWithOrdersRest toRestUserWithOrder(User user) {
        UserWithOrdersRest rest = new UserWithOrdersRest();
        rest.setId(user.getId());
        rest.setName(user.getName());
        rest.setIsActive(user.getIsActive());
        rest.setIsAdult(user.getIsAdult());
        rest.setPocket(user.getPocket());
        rest.setOrder(user.getOrder());
        return rest;
    }

    public User toRest(UserRest userRest) {
        User user = new User();
        user.setId(userRest.getId());
        user.setOrder(userRest.getOrder());
        return user;
    }
}
