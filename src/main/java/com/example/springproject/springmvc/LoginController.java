package com.example.springproject.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.inject.Model;

@Controller
public class LoginController {

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
    public String LoginPageResponse(@RequestParam String name, ModelMap model){
        model.put("name",name);
        System.out.println(name);
        return "login_validation";
    }
}
