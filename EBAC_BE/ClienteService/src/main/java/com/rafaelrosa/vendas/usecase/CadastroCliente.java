package com.rafaelrosa.vendas.usecase;

import com.rafaelrosa.vendas.domain.Cliente;
import com.rafaelrosa.vendas.repository.IClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroCliente {

    private IClienteRepository clienteRepository;

    // CONSTRUTOR
    @Autowired
    public CadastroCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // MÉTODO (CADASTRAR)
    public Cliente cadastrar(@Valid Cliente cliente) {
        return this.clienteRepository.insert(cliente);
    }

    // MÉTODO (ATUALIZAR)
    public Cliente atualizar(@Valid Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    // MÉTODO (REMOVER)
    public void remover(String id) {
        this.clienteRepository.deleteById(id);
    }
}