
package br.com.rafaelrosa.dao.jpa;

import br.com.rafaelrosa.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rafaelrosa.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
