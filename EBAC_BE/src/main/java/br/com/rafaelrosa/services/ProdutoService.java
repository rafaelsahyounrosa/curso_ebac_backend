/**
 * 
 */
package br.com.rafaelrosa.services;

import br.com.rafaelrosa.dao.IProdutoDAO;
import br.com.rafaelrosa.domain.Produto;
import br.com.rafaelrosa.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
