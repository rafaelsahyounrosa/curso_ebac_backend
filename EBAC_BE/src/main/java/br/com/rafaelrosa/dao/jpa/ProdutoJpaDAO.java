
package br.com.rafaelrosa.dao.jpa;

import br.com.rafaelrosa.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rafaelrosa.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
