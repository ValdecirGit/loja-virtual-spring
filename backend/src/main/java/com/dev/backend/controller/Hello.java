package com.dev.backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotacao que indica que é uma classe Rest
@RequestMapping("/api") // mapeamento padrão
public class Hello {

    @GetMapping("/") // rota para chama do hello
    public String hello() {
        return "Olá mundo Spring!" +new Date();
    }
}
