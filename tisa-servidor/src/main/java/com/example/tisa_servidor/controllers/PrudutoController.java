package com.example.tisa_servidor.controllers;

import com.example.tisa_servidor.dtos.ProdutoRecord;
import com.example.tisa_servidor.models.ProdutoModel;
import com.example.tisa_servidor.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.BeanUtils.copyProperties;

@RestController
@RequestMapping("/api")
public class PrudutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> iserirProduto(
            @RequestBody @Valid ProdutoRecord produtoRecord
            ){
        ProdutoModel produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoRecord, produtoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtoModel));
    }
}
