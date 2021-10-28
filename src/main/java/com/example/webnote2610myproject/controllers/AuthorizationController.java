package com.example.webnote2610myproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizationController {
    @GetMapping("authorization")
    public String main(ModelMap modelMap){
        return "authorization";
    }
}
