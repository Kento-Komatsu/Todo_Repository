package com.example.sample.sample_fortune.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    
    public String getFortune(){
        Random random = new Random();
        int num = random.nextInt(3);

        String[] fortunes = {"大吉", "吉", "凶"};
        return fortunes[num];
    }
}
