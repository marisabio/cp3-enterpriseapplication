package com.cp3.api.entities;

import com.cp3.api.services.ProdutoService;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProdutoListing(Long id,
                             String nome,
                             String descricao,
                             String categoria,
                             BigDecimal preco,
                             LocalDate dataCadastro) {

    public ProdutoListing(Produto produto) {
        this(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getCategoria(), produto.getPreco(), produto.getDataCadastro());
    }
}
