package com.rafaelrosa.vendas.usecase;

import com.rafaelrosa.vendas.domain.Produto;
import com.rafaelrosa.vendas.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BuscarProduto {

    // ATRIBUTO
    private IProdutoRepository produtoRepository;

    // CONSTRUTOR
    @Autowired
    public BuscarProduto(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // MÉTODO (1)
    public Page<Produto> buscar(Pageable pageable) {

        return produtoRepository.findAll(pageable);
    }
}
