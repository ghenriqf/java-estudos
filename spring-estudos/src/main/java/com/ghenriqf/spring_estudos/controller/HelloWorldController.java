package com.ghenriqf.spring_estudos.controller;

import com.ghenriqf.spring_estudos.domain.User;
import com.ghenriqf.spring_estudos.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

@RestController // @RestController = @Controller + @ResponseBody
// Indica que a classe é um controller de API REST.
// Os métodos retornam dados diretamente no body da resposta (JSON, String, objetos), sem view.
@RequestMapping("/hello-world")
// A anotação @RequestMapping serve para mapear uma URL para uma classe ou metodo no Spring MVC Ela diz: quando alguém acessar esse caminho na URL, chame esse metodo ou essa classe
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
