package br.com.rafaelrosa.dao;



import br.com.rafaelrosa.domain.Carro;

import java.util.List;

public interface ICarroDao {

    Carro cadastrar(Carro carro);
    List<Carro> buscarTodos();
    void excluir(Carro carro);
}
