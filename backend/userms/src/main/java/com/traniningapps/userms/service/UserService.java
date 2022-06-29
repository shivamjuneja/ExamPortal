package com.traniningapps.userms.service;

import com.traniningapps.userms.entity.User;
import com.traniningapps.userms.entity.UserRole;
import com.traniningapps.userms.exception.UserAlreadyExistException;
import com.traniningapps.userms.exception.UserNotFoundException;

import java.util.Set;

public interface UserService {

    //creating user
    User createUser(User user, Set<UserRole> userRoles) throws UserAlreadyExistException;
    User getUser(String username) throws UserNotFoundException;

    void deleteById(Long id);
}
