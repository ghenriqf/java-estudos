package com.ghenriqf.spring_estudos.controller;

import com.ghenriqf.spring_estudos.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;

    }
    @GetMapping

    public String helloWorld() {
        return helloWorldService.helloName("Gabriel");
    }
}
