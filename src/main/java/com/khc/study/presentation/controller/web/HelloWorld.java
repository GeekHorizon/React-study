package com.khc.study.presentation.controller.web;
 
import java.util.List;

import com.khc.study.domain.model.entity.User;
import com.khc.study.domain.repository.UserRepository;
import com.khc.study.infrastructure.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @Autowired 
    UserRepository userRepository;

    @GetMapping("/tttt.html")
    public String page(Model model) {
      List<User> users = userRepository.findAll();

      System.out.println(users);

      model.addAttribute("pageName", "app");


      return "page";
    }
} 