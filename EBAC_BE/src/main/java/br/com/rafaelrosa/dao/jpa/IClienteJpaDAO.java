
package br.com.rafaelrosa.dao.jpa;

import br.com.rafaelrosa.dao.generic.jpa.IGenericJapDAO;
import br.com.rafaelrosa.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
