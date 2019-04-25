package com.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.service.MonkeyService;

@RestController
public class MonkeyController {
    
    @Autowired
    MonkeyService monkeyService;
    
    @GetMapping("/monkeys")
    public List<String> getMonkeys(){     
        return monkeyService.getAllMonkeyTypes();
    }
}
