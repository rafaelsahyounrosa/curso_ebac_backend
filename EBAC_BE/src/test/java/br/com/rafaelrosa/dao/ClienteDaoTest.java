package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

public class ClienteDaoTest {


    @Test
    public void cadastratTest() throws Exception{
        IClienteDao dao = new ClienteDao();

        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");
        cliente.setCodigo("01");

        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        Assert.assertNotNull(clienteBD);
        Assert.assertNotNull(clienteBD.getId());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());

        Integer qtdDel = dao.excluir(clienteBD);
        Assert.assertNotNull(qtdDel);
    }
}