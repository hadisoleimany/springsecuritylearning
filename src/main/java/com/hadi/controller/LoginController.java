package com.hadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/hi")
    @ResponseBody
    public String sayHi(){
        return "Hi Hadi !!!!!";
    }

    @GetMapping("/bye")
    @ResponseBody
    public String sayBye(){
        return "Bye Hadi !!!!!";
    }
    @GetMapping("/customLogInPage")
    public String logIn(){
        return "logIn";
    }
}
