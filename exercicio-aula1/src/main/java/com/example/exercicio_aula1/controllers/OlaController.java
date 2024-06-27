package com.example.exercicio_aula1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entrada")
public class OlaController {
    @GetMapping("/ola")
    public String dizola() {
        return "Ola mundo";
    }

    @GetMapping("/cumprimentar")
    public String cumprimenta(
            @RequestParam String name
    ){
        return "Olá" + name;
    }

    @GetMapping("/ver-idade")
    public String verIdade(
            @RequestParam String name,
            @RequestParam int idade
    ){
        return "O" + name + "tem" + idade + "anos";
    }
    /*Função que recebe nome e idade e
    devolve uma String.
    Ex.: nome=João&idade=17
    output:
    João tem 17 anos
     */
}
