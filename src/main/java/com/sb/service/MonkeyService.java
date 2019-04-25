package com.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MonkeyService {
    public List<String> getAllMonkeyTypes(){
        List<String> monkeys = new ArrayList<String>();
        monkeys.add("Mandrill");
        monkeys.add("Rhesus");
        monkeys.add("Barbary");
        monkeys.add("Lion-tailed");
        monkeys.add("Lesula");
        monkeys.add("Gelada");
        
        return monkeys;
    }
}
