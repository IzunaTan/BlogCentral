package be.intecbrussel.data;

import be.intecbrussel.model.entities.Author;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AuthorMapper {
    public void addNewAuthor(Author author) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(author);
        tx.commit();
        em.close();
    }

    public void deleteAuthor(Author author) {

    }

    public void editAuthor(Author author) {

    }

    public void getAuthor() {

    }
}
