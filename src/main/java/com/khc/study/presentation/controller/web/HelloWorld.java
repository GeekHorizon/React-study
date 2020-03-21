package com.khc.study.presentation.controller.web;
 
import java.util.List;

import com.khc.study.domain.model.entity.User;
import com.khc.study.infrastructure.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloWorld {

    @Autowired
    private UserDao userdao;

    @GetMapping("/{name}.html")
    public String page(@PathVariable String name, Model model) {
      System.out.println("@@@@@@@GGGGG@@@@@1221@@@@");
      model.addAttribute("pageName", name);

      List<User> users = userdao.findAll();

      System.out.println(users);

      return "page";
    }
} 