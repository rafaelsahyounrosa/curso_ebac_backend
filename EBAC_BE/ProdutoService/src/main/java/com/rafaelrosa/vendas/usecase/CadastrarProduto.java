package com.rafaelrosa.vendas.usecase;

import com.rafaelrosa.vendas.domain.Produto;
import com.rafaelrosa.vendas.repository.IProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarProduto {

    // ATRIBUTO
    private IProdutoRepository produtoRepository;

    // CONSTRUTOR
    @Autowired
    public CadastrarProduto(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // MÉTODO (1)
    public Produto cadastrar(@Valid Produto produto) {

        produto.setStatus(Produto.Status.ATIVO);
        return this.produtoRepository.insert(produto);
    }

    // MÉTODO (2)
    public Produto atualizar(@Valid Produto produto) {

        return this.produtoRepository.save(produto);
    }

    // MÉTODO (3)
    public void remover(String id) {

        Produto prod = produtoRepository.findById(id).orElseThrow();
        prod.setStatus(Produto.Status.INATIVO);
        this.produtoRepository.save(prod);
    }
}
