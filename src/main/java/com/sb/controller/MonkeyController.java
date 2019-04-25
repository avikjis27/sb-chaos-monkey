package com.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sb.bo.MonkeyBO;
import com.sb.service.MonkeyService;

@Controller
public class MonkeyController {
    
    @Autowired
    MonkeyService monkeyService;
    
    @GetMapping("/")
    public String getMonkeys(Model model){    
        
        List<MonkeyBO> monkeys =  monkeyService.getAllMonkeyTypes();
        model.addAttribute("monkies", monkeys);
        return "adopt";
        
    }
}
