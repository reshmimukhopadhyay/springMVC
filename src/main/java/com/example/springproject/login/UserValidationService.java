package com.example.springproject.login;

public class UserValidationService {

    public boolean isUserValid(String name,String password){
        if(name.equals("Test") && password.equals("Test")){
            return true;
        }
        return false;
    }
}
