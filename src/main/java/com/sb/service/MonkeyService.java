package com.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.bo.MonkeyBO;

@Service
public class MonkeyService {
    public List<MonkeyBO> getAllMonkeyTypes(){
        List<MonkeyBO> monkeys = new ArrayList<MonkeyBO>();
        MonkeyBO cat1 = new MonkeyBO("Bobo", "1", "10000.00", "Mandril");
        MonkeyBO cat2 = new MonkeyBO("Momo", "2", "20000.00", "Rhesus");
        MonkeyBO cat3 = new MonkeyBO("Mambo", "3", "30000.00", "Barbary");
        monkeys.add(cat1);
        monkeys.add(cat2);
        monkeys.add(cat3);
//        monkeys.add("Mandrill");
//        monkeys.add("Rhesus");
//        monkeys.add("Barbary");
//        monkeys.add("Lion-tailed");
//        monkeys.add("Lesula");
//        monkeys.add("Gelada");
        
        return monkeys;
    }
}
