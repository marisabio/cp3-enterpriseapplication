package com.cp3.api.services;

import com.cp3.api.entities.Produto;

import com.cp3.api.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> GetAllProdutos(Pageable pagination) {
        return repository.findAll();
    }

}
