package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MarcaDao implements IMarcaDao {
    @Override
    public Marca cadastrar(Marca marca) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(marca);
        entityManager.getTransaction().commit();

        entityManager.refresh(marca);

        entityManager.close();
        entityManagerFactory.close();
        return marca;
    }

    @Override
    public List<Marca> buscarTodos() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Marca> cq = cb.createQuery(Marca.class);
        Root<Marca> marca = cq.from(Marca.class);
        cq.select(marca);

        TypedQuery<Marca> query = entityManager.createQuery(cq);
        List<Marca> marcas = query.getResultList();

        entityManager.close();
        entityManagerFactory.close();

        return marcas;
    }

    @Override
    public void excluir(Marca marca) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        marca = entityManager.merge(marca);
        entityManager.remove(marca);
        entityManager.getTransaction().commit();



        entityManager.close();
        entityManagerFactory.close();

    }
}
