/**
 * 
 */
package br.com.rafaelrosa.dao;

import java.util.List;

import br.com.rafaelrosa.domain.Curso;
import br.com.rafaelrosa.domain.Matricula;

/**
 * 
 *
 */
public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);

	Matricula buscarPorCodigoCurso(String codigoCurso);

	Matricula buscarPorCurso(Curso curso);

	Matricula buscarPorCodigoCursoCriteria(String codigoCurso);

	Matricula buscarPorCursoCriteria(Curso curso);

	List<Matricula> buscarTodos();

	void excluir(Matricula matricula);
}
