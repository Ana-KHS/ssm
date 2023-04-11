package com.study.ssm.user.controller;


import com.study.ssm.common.entity.CommEntity;
import com.study.ssm.common.service.CommService;
import com.study.ssm.user.entity.UserBasicEntity;
import com.study.ssm.user.repository.UserRepository;
import com.study.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommService commService;

    @GetMapping("/")
    public String ssmMain(HttpSession session, Model model) {
        String userBasicEntity = (String) session.getAttribute("userName");
        String userDept = (String) session.getAttribute("userName");
        if(userBasicEntity != null) {
            model.addAttribute("userName", userBasicEntity);
            model.addAttribute("userDept", userDept);
            return "ssmMain";
        }else {
            return "redirect:/login";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "user/userLogin";
    }

    @PostMapping("/login")
    public String loginResult(@RequestParam String userId, @RequestParam String userPassword, HttpSession session) {
        boolean loginResult = userService.login(userId, userPassword);
        UserBasicEntity userBasicEntity = userRepository.findUser(userId, userPassword);
        if(loginResult) {
            session.setAttribute("userName", userBasicEntity.getUserName());
            session.setAttribute("userDept", userBasicEntity.getUserDept());
            return "redirect:/";
        }else {
            return "redirect:/login";
        }
    }
}
