package com.example.springproject.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value="/login")
    //@ResponseBody
    public String sayHello(){
        return "login_1";
    }

    /*@RequestMapping(value="/login1")
    public String loginPage(){
        return "Welcome-login";
    }*/
}
