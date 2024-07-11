package controller;

import model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

public class LivrosController {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();

    @GetMapping("/lista")
    public ArrayList<Livro> listarTodos() {
        return listaDeLivros;
    }

    @PostMapping("/inserir")
    public String inserirLivro(

            @RequestBody Livro livro

    ) {
        listaDeLivros.add(livro);
        return "Livro inserido com sucesso";
    }

    
}