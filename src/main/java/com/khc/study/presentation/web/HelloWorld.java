package com.khc.study.presentation.web;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloWorld {
    


    @GetMapping("/{name}.html")
    public String page(@PathVariable String name, Model model) {

        System.out.println("@@@@@@@GGGGG@@@@@1221@@@@");

        model.addAttribute("pageName", name);
        return "page";
    }

} 