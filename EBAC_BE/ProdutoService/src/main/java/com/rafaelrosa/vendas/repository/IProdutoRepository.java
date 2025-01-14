package com.rafaelrosa.vendas.repository;

import com.rafaelrosa.vendas.domain.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String> {


    Page<Produto> findAllByStatus(Pageable pageable, Produto.Status status);

}

