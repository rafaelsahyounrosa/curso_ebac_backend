package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.domain.Acessorio;

import java.util.List;

public interface IAcessorioDao {

    Acessorio cadastrar(Acessorio acessorio);
    List<Acessorio> buscarTodos();
    void excluir(Acessorio acessorio);
}
