package br.com.rafaelrosa;

import br.com.rafaelrosa.dao.IProdutoDao;
import br.com.rafaelrosa.dao.ProdutoDao;
import br.com.rafaelrosa.domain.Curso;
import br.com.rafaelrosa.domain.Matricula;
import br.com.rafaelrosa.domain.Produto;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ProdutoTest {

    private IProdutoDao produtoDao;
    Produto produto;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Before
    public void setUp() {
        produto = new Produto();
        produto.setNome("Produto 1");
        produto.setPreco(15.99);
        produto.setCodigo("7hg23786g");
    }

    @After
    public void end() {
        List<Produto> list = produtoDao.buscarTodos();
        list.forEach(prod -> produtoDao.excluir(prod));
    }

    @Test
    public void cadastraProduto() {
        produto = produtoDao.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());

    }
}
