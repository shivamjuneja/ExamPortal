package com.traniningapps.userms.exception;

import com.traniningapps.userms.entity.User;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String msg)
    {
        super(msg);
    }
}
