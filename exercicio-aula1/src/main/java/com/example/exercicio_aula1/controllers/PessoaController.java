package com.example.exercicio_aula1.controllers;

import com.example.exercicio_aula1.Models.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public  class PessoaController{
    @GetMapping("/pessoa")
    public Pessoa gerarPessoa(
            @RequestParam String nome,
            @RequestParam int idade
    ){
        Pessoa pessoa1 = new Pessoa(nome, idade);
        return pessoa1;
    }
}