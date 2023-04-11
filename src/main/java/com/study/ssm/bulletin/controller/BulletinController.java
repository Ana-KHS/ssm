package com.study.ssm.bulletin.controller;

import com.study.ssm.bulletin.entity.BulletinBasicEntity;
import com.study.ssm.bulletin.service.BulletinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/bulletin")
public class BulletinController {
    @Autowired
    BulletinService bulletinService;

    @GetMapping("/bulletin_write")
    public String writeBulletin() {
        return "bulletin/bulletinWrite";
    }

    @GetMapping("/bulletin_board")
    public String boardBulletin(Model model) {
        model.addAttribute("bulletinList", bulletinService.bulletinList());
        return "bulletin/bulletinBoard";
    }
    @PostMapping("/insertBulletin")
    public String insertBulletin(BulletinBasicEntity bulletinBasicEntity, HttpSession session) {
        bulletinService.insertBulletin(bulletinBasicEntity, session);
        return "redirect:/bulletin/bulletin_board";
    }
}
