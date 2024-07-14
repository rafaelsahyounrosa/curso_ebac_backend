
package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.dao.generic.IGenericDAO;
import br.com.rafaelrosa.domain.Venda;
import br.com.rafaelrosa.exceptions.DAOException;
import br.com.rafaelrosa.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
