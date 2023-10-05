package com.example.springproject.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {

    public boolean loginAuthentication(String name,String password){
        if(name.equalsIgnoreCase("Test") && password.equals("Test")){
            return true;
        }
        return false;
    }
}
