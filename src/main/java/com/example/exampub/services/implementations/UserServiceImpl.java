package com.example.exampub.services.implementations;

import com.example.exampub.convertors.UserConvertor;
import com.example.exampub.entity.User;
import com.example.exampub.repositories.UserRepository;
import com.example.exampub.rest.models.UserRest;
import com.example.exampub.rest.models.UserWithOrdersRest;
import com.example.exampub.services.UserService;
import com.example.exampub.services.exceptions.UserServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConvertor userConvertor;

    @Override
    public List<UserRest> getAllUsers() {
        logger.info("Get all users");
        return userConvertor.toRest(userRepository.findAll());
    }

    @Override
    public UserWithOrdersRest getUserWithOrdersByID(Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserServiceException("Can't find the id number");
        }
        logger.info("Getting user");
        return userConvertor.toRestUserWithOrder(user.get());
    }
}
