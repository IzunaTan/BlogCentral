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
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(author);
        tx.commit();
        em.close();
    }

    public void editAuthor(Author author) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Author dbAuthor = em.find(Author.class, author.getUsername());
        dbAuthor.cloneFrom(author);
        transaction.commit();

        em.close();
    }

    public Author getAuthor(String username) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Author dbAuthor = em.find(Author.class, username);
        transaction.commit();

        em.close();
        return dbAuthor;
    }
}
