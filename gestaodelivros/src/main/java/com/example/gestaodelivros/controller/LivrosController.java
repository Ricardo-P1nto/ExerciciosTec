package com.example.gestaodelivros.controller;

import com.example.gestaodelivros.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public List<Livro> pesquisaTitulo (@RequestParam String titulo){
        for (Livro livro : listaDeLivros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return (List<Livro>) livro;
            }
        }
        return null;
    }

    @GetMapping("/pesquisa-autor")
    public List<Livro> pesquisaAutor (@RequestParam String autor){
        for (Livro livro : listaDeLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                return (List<Livro>) livro;
            }
        }
        return null;
    }


    @GetMapping("/pesquisa-editora")
    public List<Livro> pesquisaEditora (@RequestParam String editora){
        for (Livro livro : listaDeLivros){
            if (livro.getEditora().equalsIgnoreCase(editora)){
                return (List<Livro>) livro;
            }
        }
        return null;
    }

    @GetMapping("/pesquisa-paginas")
    public List<Livro> pesquisaPaginas (@RequestParam String paginas){
        List<Livro> livrosComPaginasIguaisOuSuperiores = new ArrayList<>();
        int paginaslivro = Integer.parseInt(paginas);

        for (Livro livro : listaDeLivros){
            if (Integer.parseInt(livro.getNumeroPaginas()) >= paginaslivro){
                livrosComPaginasIguaisOuSuperiores.add(livro);

            }

        }
        return livrosComPaginasIguaisOuSuperiores;
    }
}