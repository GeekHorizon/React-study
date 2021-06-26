package com.khc.study.presentation.controller.web;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/main.html")
    public String page(final Model model) {
      model.addAttribute("pageName", "app");
      return "page";
    }
} 