package com.example.tisa_servidor.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="Vendedor")
public class VendedorModel {
    private static final long serialVersionID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idVendedor;
    private String nomeVendedor;
    private Date dataEntrada;

    public UUID getIdVendedor() {
        return idVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
