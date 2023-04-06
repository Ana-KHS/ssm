package com.study.ssm.user.controller;


import com.study.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String ssmMain() {
        return "ssmMain";
    }

    @GetMapping("/login")
    public String login() {
        return "user/userLogin";
    }

    @PostMapping("/login")
    public String loginResult(@RequestParam String userId, @RequestParam String userPassword) {
        boolean loginResult = userService.login(userId, userPassword);

        if(loginResult) {
            return "ssmMain";
        }else {
            return "redirect:/";
        }
    }

    @GetMapping("/admin/userregist")
    public String userRegistration() {
        return "user/admin/userRegist";
    }
}
