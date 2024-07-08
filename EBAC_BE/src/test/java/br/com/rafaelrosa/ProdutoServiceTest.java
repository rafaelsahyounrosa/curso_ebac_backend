/**
 * 
 */
package br.com.rafaelrosa;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rafaelrosa.dao.IProdutoDAO;
import br.com.rafaelrosa.dao.ProdutoDaoMock;
import br.com.rafaelrosa.domain.Produto;
import br.com.rafaelrosa.exceptions.TipoChaveNaoEncontradaException;
import br.com.rafaelrosa.services.IProdutoService;
import br.com.rafaelrosa.services.ProdutoService;


public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Rafael Rosa");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Rafael Rosa", produto.getNome());
	}
}
