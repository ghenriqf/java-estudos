package com.ghenriqf.spring_estudos.controller;

import com.ghenriqf.spring_estudos.domain.User;
import com.ghenriqf.spring_estudos.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }
}
