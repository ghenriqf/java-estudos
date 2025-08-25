package com.ghenriqf.spring_estudos.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
