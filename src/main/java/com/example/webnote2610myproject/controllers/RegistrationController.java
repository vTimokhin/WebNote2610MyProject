package com.example.webnote2610myproject.controllers;

import com.example.webnote2610myproject.models.User;
import com.example.webnote2610myproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("registration")
   //public String registration(@ModelAttribute User user,
    public String registration(ModelMap modelMap) {
      /*  if (user.getLogin() == null)
            user = new User(0, "", "", "", "", null, null);
        modelMap.put("user", user);*/

        return "registration";
    }

    @PostMapping("register")
    public String register(@RequestParam String login,
                                 @RequestParam String pass,
                                 @RequestParam String nickName,
                                 @RequestParam String mail,
                                 ModelMap modelMap) {

        User user = new User(0, login, pass, nickName, mail, User.Status.ACTIVE, null);
        if (userService.findByLogin(login) == null) {
            userService.save(user);
           //return new ModelAndView("redirect:main");
        }
        modelMap.put("user", user);
        //return new ModelAndView("redirect:registration", modelMap);
       //return new ModelAndView("redirect:main");
        return "redirect:main";
    }
;
}

