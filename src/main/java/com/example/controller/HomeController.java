package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("home")
public class HomeController {
    @GetMapping
    public ModelAndView getHome(){
        Map<String,String> model = new HashMap<>();
        model.put("name","tai");
        ModelAndView mav = new ModelAndView("home",model);
        return mav;
    }
}
