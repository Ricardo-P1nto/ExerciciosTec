package com.example.Ficha2Correcao.controller;

import com.example.Ficha2Correcao.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping ("/livros")
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

    @GetMapping("/existe-livro")
    public boolean existeLivro(@RequestParam String titulo) {
        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
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
    @GetMapping ("/pesquisa-autor")
    public ArrayList<Livro> pesquisaautor(
            @RequestParam String autor
    ){
        ArrayList<Livro> livrosDoAutor = new ArrayList<>();
        for (Livro livro: listaDeLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livrosDoAutor.add (livro);
            }
        }
        return livrosDoAutor;
    }

    @GetMapping ("/pesquisa-editora")
    public ArrayList<Livro> pesquisaeditora(
            @RequestParam String editora
    ){
        ArrayList<Livro> livrosDaEditora = new ArrayList<>();
        for (Livro livro: listaDeLivros){
            if (livro.getEditor().equalsIgnoreCase(editora)){
                livrosDaEditora.add (livro);
            }
        }
        return livrosDaEditora;
    }
    @GetMapping ("/pesquisa-paginas")
    public ArrayList<Livro> pesquisapaginas(
            @RequestParam int paginas
    ){
        ArrayList<Livro> livrosPaginas = new ArrayList<>();
        for (Livro livro: listaDeLivros){
            if (paginas<=livro.getNumeroDePaginas()){
                livrosPaginas.add(livro);
            }
        }
        return livrosPaginas;
    }

}
