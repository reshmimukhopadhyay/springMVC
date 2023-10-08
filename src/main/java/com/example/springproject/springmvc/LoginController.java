package com.example.springproject.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.enterprise.inject.Model;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private LoginAuthenticationService loginAuthenticationService;

    @RequestMapping(value="/login")
    //@ResponseBody
    public String sayHello(){
        return "login_1";
    }

    @RequestMapping(value="/login1",method= RequestMethod.GET)
    public String loginPage(){
        return "Welcome_login_post_1";
    }

    @RequestMapping(value="/login1",method=RequestMethod.POST)
    public String LoginPageResponse(@RequestParam String name, @RequestParam String password,ModelMap model){
        if(!loginAuthenticationService.loginAuthentication(name,password)){
            return "Welcome_login_post_1";
        }
        model.put("name",name);
        model.put("password",password);
        return "login_validation";
    }
}
