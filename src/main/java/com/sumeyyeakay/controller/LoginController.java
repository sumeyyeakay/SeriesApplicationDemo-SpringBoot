package com.sumeyyeakay.controller;

import com.sumeyyeakay.model.Users;
import com.sumeyyeakay.service.base.UserService;
import io.swagger.annotations.Api;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "User Controller", description = "APIs that making operations about the users")
public class LoginController {

    //user interface -> service
    private UserService userService;


    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public String register (Model model){
        model.addAttribute("user", new Users());
        return "content/register";
                //icerik/kayit
    }
}
