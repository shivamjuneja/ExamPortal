package com.traniningapps.userms.controller;

import com.traniningapps.userms.entity.Role;
import com.traniningapps.userms.entity.User;
import com.traniningapps.userms.entity.UserRole;
import com.traniningapps.userms.exception.UserAlreadyExistException;
import com.traniningapps.userms.exception.UserNotFoundException;
import com.traniningapps.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@CrossOrigin("*")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws UserAlreadyExistException
    {
        //role object
        Role role=new Role();
        role.setRoleName("user");
        role.setRoleId(45L);

        //userRole object
        UserRole userRole=new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        Set<UserRole> roles=new HashSet<>();
        roles.add(userRole);

        return userService.createUser(user,roles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) throws UserNotFoundException
    {
        System.out.println("inside get user in controller");
        return userService.getUser(username);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }
}
