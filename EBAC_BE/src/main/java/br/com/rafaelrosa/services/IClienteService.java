/**
 * 
 */
package br.com.rafaelrosa.services;

import br.com.rafaelrosa.domain.Cliente;
import br.com.rafaelrosa.exceptions.DAOException;
import br.com.rafaelrosa.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
