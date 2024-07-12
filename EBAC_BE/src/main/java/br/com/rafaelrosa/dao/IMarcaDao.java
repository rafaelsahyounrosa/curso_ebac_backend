package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.domain.Marca;

import java.util.List;

public interface IMarcaDao {

    Marca cadastrar(Marca marca);
    List<Marca> buscarTodos();
    void excluir(Marca marca);
}
