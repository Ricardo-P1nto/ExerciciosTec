package com.example.tisa_servidor.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="Cliente")
public class ClienteModel {
    private static final long serialVersionID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCliente;
    private String nome;
    private int numeroTelemovel;
    private int nif;
    private String endereco;

    public UUID getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelemovel() {
        return numeroTelemovel;
    }

    public int getNif() {
        return nif;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNumeroTelemovel(int numeroTelemovel) {
        this.numeroTelemovel = numeroTelemovel;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
