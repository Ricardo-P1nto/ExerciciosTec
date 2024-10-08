package com.example.tisa_servidor.models;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.UUID;

@Entity
@Table(name="Venda")
public class VendaModel {
    private static final long serialVersionID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID idVendas;
    private Data dataCompra;

    public UUID getIdVendas() {
        return idVendas;
    }

    public Data getDataCompra() {
        return dataCompra;
    }

    public UUID getIdCliente() {
        return ClienteModel.idCliente;
    }
}
