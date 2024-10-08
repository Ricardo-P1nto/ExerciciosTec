package com.example.tisa_servidor.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="Produtos")
public class ProdutoModel {
    private static final long serialVersionID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduto;
    private String nome;
    private float valor;

    public UUID getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
