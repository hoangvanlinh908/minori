package com.msita.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MinoriController {
    @GetMapping("/home")
    public String Minori(){
        return "homepage";
    }
    @GetMapping("/content")
    public String content(){
        return "content";
    }
    @GetMapping("/contact")
    public String contact(){
        return "CONTACT";
    }
    @GetMapping("/information")
    public String information(){
        return "INFORMATION";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
