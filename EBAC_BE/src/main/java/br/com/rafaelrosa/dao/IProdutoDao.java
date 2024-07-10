package br.com.rafaelrosa.dao;


import br.com.rafaelrosa.domain.Produto;

public interface IProdutoDao {

    public Integer cadastrar(Produto produto) throws Exception;

    public Produto consultar(String codigo) throws Exception;

    public Integer excluir(Produto produto) throws Exception;
}
