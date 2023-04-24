package com.study.ssm.user.controller;


import com.study.ssm.common.service.CommService;
import com.study.ssm.user.entity.UserInfoEntity;
import com.study.ssm.user.repository.UserRepository;
import com.study.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String ssmMain(HttpSession session, Model model) {
        String sessionUserName = (String) session.getAttribute("sessionUserName");
        String sessionUserDept = (String) session.getAttribute("sessionUserDept");
        if(sessionUserName != null) {
            model.addAttribute("sessionUserName", sessionUserName);
            model.addAttribute("sessionUserDept", sessionUserDept);
            return "pages/ssmMain";
        }else {
            return "redirect:/login";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "pages/user/userLogin";
    }

    @PostMapping("/login")
    public String loginResult(@RequestParam String userId, @RequestParam String userPassword, HttpSession session) {
        boolean loginResult = userService.login(userId, userPassword);
        UserInfoEntity userInfoEntity = userRepository.findUser(userId, userPassword);
        if(loginResult) {
            session.setAttribute("sessionUserName", userInfoEntity.getUserName());
            session.setAttribute("sessionUserDept", userInfoEntity.getUserDept());
            return "redirect:/";
        }else {
            return "redirect:/login";
        }
    }
}
