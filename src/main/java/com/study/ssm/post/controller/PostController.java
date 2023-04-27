package com.study.ssm.post.controller;

//import com.study.ssm.post.dto.PostDto;
import com.study.ssm.post.entity.PostBasicEntity;
import com.study.ssm.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/write")
    public String postWrite() {
        return "pages/post/postWrite";
    }

    /*@GetMapping("/list")
    public String postList(Model model, HttpSession session) {
        model.addAttribute("sessionUser", session.getAttribute("userName"));
        model.addAttribute("postList", postService.postList());
        return "pages/post/postList";
    }*/
   /* @GetMapping("/list")
    public ModelAndView postListTest(HttpSession session) {
        String url = "pages/post/postList";
        ModelAndView mv = new ModelAndView();
        mv.setViewName(url);
        mv.addObject("sessionUserName", session.getAttribute("sessionUserName"));
        mv.addObject("postList", postService.postList());
        return mv;
    }*/
    @GetMapping("/list")
    public ModelAndView postListTest(HttpSession session) {
        String url = "pages/post/postList";
        ModelAndView mv = new ModelAndView();
        mv.setViewName(url);
        mv.addObject("sessionUserName", session.getAttribute("sessionUserName"));
        mv.addObject("postList", postService.postList());
        return mv;
    }

    @PostMapping("/insertPost")
    public String insertPost(PostBasicEntity postBasicEntity, HttpSession session) {
        postService.insertPost(postBasicEntity, session);
        return "redirect:/post/list";
    }

    @GetMapping("/list/postNo{postNo}")
    public String postDetail(Model model, @PathVariable final Long postNo, HttpSession session) {
        model.addAttribute("sessionUserName", session.getAttribute("sessionUserName"));
        model.addAttribute("detailList", postService.postDetail(postNo));
        return "pages/post/postDetail";
    }

    @PostMapping("/list/delete")
    public String updateDelYn(Model model, Long postNo) {
        postService.updateDelYn(postNo);
        return "redirect:/post/list";
    }
}
