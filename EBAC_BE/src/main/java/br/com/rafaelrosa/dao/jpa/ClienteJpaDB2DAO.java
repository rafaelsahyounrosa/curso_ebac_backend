
package br.com.rafaelrosa.dao.jpa;

import br.com.rafaelrosa.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.rafaelrosa.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
