package com.cp3.api.controllers;

import com.cp3.api.entities.ProdutoListing;
import com.cp3.api.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoListing>> listar(@PageableDefault(size = 10, sort = {"id"}) Pageable pagination) {
        List<ProdutoListing> page;
        page = service.GetAllProdutos(pagination).stream().map(ProdutoListing::new).toList();
        return ResponseEntity.ok(page);
    }

}
