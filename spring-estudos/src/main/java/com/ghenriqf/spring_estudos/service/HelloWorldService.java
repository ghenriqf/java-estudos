package com.ghenriqf.spring_estudos.service;

import org.springframework.stereotype.Service;

@Service
// @Service = define onde ficam as regras de negócio.
// Spring Boot = cria o objeto automaticamente e injeta no lugar certo (injeção de dependência).
public class HelloWorldService {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
