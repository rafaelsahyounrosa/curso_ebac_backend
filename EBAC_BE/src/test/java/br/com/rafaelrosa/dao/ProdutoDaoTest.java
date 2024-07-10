package br.com.rafaelrosa.dao;


import br.com.rafaelrosa.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoDaoTest {

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDao dao = new ProdutoDao();
        Produto produto = new Produto();
        produto.setNome("Produto 1");
        produto.setCodigo("101010");
        produto.setPreco(5.99);

        Integer qtd = dao.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoBD);
        Assert.assertNotNull(produtoBD.getId());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getPreco(), produtoBD.getPreco(), 0);

        Integer qtdDell = dao.excluir(produtoBD);
        Assert.assertTrue(qtdDell == 1);
    }
}