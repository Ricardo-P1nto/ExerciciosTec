package com.example.exercicio_aula1.controllers;

import com.example.exercicio_aula1.Models.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    @GetMapping("/pessoa")
    public Pessoa gerarPessoa(
            @RequestParam String nome,
            @RequestParam int idade
    ) {
        Pessoa pessoa1 = new Pessoa(nome, idade);
        return pessoa1;
    }

    @PostMapping("/criar")
    public Pessoa criarPessoa(
            @RequestBody Pessoa pessoa1
    ) {
        listaPessoas.add(pessoa1);
        return pessoa1;
    }

    @GetMapping("/listar")
    public ArrayList<Pessoa> listarPessoas() {
        return listaPessoas;
    }
}

