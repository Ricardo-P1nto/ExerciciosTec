package com.example.gestaodelivros.controller;

import com.example.gestaodelivros.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/livros")
public class LivrosController {
    private final ArrayList<Livro> listaDeLivros = new ArrayList<>();
    private long lastId = 0L;

    @GetMapping("/lista")
    public ArrayList<Livro> listarTodos() {
        return listaDeLivros;
    }

    @GetMapping("/existe-livro")
    public boolean existeLivro(@RequestParam String titulo) {
        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    @PostMapping("/inserir-livro")
    public String inserirLivro(@RequestBody Livro livro){
        lastId++;
        livro.setId(lastId);
        listaDeLivros.add(livro);
        return "Livro inserido com sucesso";

    }

    @GetMapping("/pesquisa-titulo")
    public Livro pesquisaTitulo (@RequestParam String titulo){
        for (Livro livro : listaDeLivros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }

    @GetMapping("/pesquisa-autor")
    public Livro pesquisaAutor (@RequestParam String autor){
        for (Livro livro : listaDeLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                return livro;
            }
        }
        return null;
    }
}
