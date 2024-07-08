/**
 * 
 */
package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.dao.generic.IGenericDAO;
import br.com.rafaelrosa.domain.Venda;
import br.com.rafaelrosa.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
