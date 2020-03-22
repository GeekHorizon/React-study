package com.khc.study.presentation.controller.web;
 
import java.util.List;

import com.khc.study.domain.model.entity.User;
import com.khc.study.infrastructure.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserDao userdao;

    @GetMapping("/main.html")
    public String page(final Model model) {
      model.addAttribute("pageName", "app");
      return "page";
    }
} 