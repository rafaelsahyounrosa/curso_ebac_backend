package br.com.rafaelrosa.dao;


import br.com.rafaelrosa.domain.Produto;

import java.util.List;

public interface IProdutoDao {

    public Produto cadastrar(Produto produto);

    public void excluir(Produto produto);

    public List<Produto> buscarTodos();
}
