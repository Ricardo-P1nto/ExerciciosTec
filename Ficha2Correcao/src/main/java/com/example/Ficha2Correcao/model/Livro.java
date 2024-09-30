package com.example.Ficha2Correcao.model;

import java.util.UUID;

public class Livro {
    private UUID id;
    private String titulo;
    private String autor;
    private String editor;
    private int numeroDePaginas;

    public Livro(int numeroDePaginas, String editor, String autor, String titulo) {
        this.numeroDePaginas = numeroDePaginas;
        this.editor = editor;
        this.autor = autor;
        this.titulo = titulo;
        this.id = UUID.randomUUID();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public UUID getId() {
        return id;
    }
}
