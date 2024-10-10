package com.example.tisa_servidor.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoRecord(@NotBlank String nome, @NotNull float valor) {

}
