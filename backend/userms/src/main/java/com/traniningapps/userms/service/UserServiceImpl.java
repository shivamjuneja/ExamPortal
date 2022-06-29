package com.traniningapps.userms.service;

import com.traniningapps.userms.entity.User;
import com.traniningapps.userms.entity.UserRole;
import com.traniningapps.userms.exception.UserAlreadyExistException;
import com.traniningapps.userms.exception.UserNotFoundException;
import com.traniningapps.userms.repo.RoleRepository;
import com.traniningapps.userms.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws UserAlreadyExistException {
        User local = userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("inside if condition");
            throw new UserAlreadyExistException("user is presnet");
        } else {
            for (UserRole iter : userRoles) {
                roleRepository.save(iter.getRole());
            }
        }
        user.getUserRoles().addAll(userRoles);
        local = this.userRepository.save(user);
        return local;
    }

    @Override
    public User getUser(String username) throws UserNotFoundException {
        User user=userRepository.findByUsername(username);
//        Optional<User>optional =userRepository.findById(1L);
        if(user==null)
        {
            throw new UserNotFoundException("user not found");
        }
        return user;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
