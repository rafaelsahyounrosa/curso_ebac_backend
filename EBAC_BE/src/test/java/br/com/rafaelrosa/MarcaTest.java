package br.com.rafaelrosa;

import br.com.rafaelrosa.dao.*;
import br.com.rafaelrosa.domain.Acessorio;
import br.com.rafaelrosa.domain.Carro;
import br.com.rafaelrosa.domain.Marca;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class MarcaTest {

    private IMarcaDao marcaDao;
    private ICarroDao carroDao;
    private IAcessorioDao acessorioDao;



    public MarcaTest() {
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
        acessorioDao = new AcessorioDao();

    }

//    @Before
//    public void setUp() {
//
//    }

//    @After
//    public void tearDown() {
//        List<Marca> marcas = marcaDao.buscarTodos();
//        marcas.forEach(m -> marcaDao.excluir(m));
//    }

    @Test
    public void cadastrar() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Marca marca = new Marca();
        marca.setNome("Marca 1");

        entityManager.persist(marca);
       // marca = marcaDao.cadastrar(marca);

        Carro carro = criaCarro("Modelo 1", marca, entityManager);
        marca.add(carro);
        //carro.setMarca(marca);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        Assert.assertNotNull(marca);
        Assert.assertNotNull(marca.getId());

    }

    private Acessorio criaAcessorio(String nome, EntityManager entityManager) {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome(nome);


        //acessorioDao.cadastrar(acessorio);
        entityManager.persist(acessorio);

        return acessorio;
    }

    private Carro criaCarro(String modelo, Marca marca, EntityManager entityManager){

        Acessorio acessorio1 = criaAcessorio("ac 1", entityManager);
        Acessorio acessorio2 = criaAcessorio("ac 2", entityManager);

        Carro carro = new Carro();
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.add(acessorio1);
        carro.add(acessorio2);

        acessorio1.add(carro);
        acessorio2.add(carro);

        entityManager.persist(carro);

        return carro;
        //return carroDao.cadastrar(carro);
    }



}
