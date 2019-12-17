package be.intecbrussel.data.mappers;

import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class AuthorMapper extends GenericMapper {
    public List<Author> getAuthorsByTags(String tags) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction et = em.getTransaction();

        et.begin();
        TypedQuery<Author> query = em.createQuery("SELECT a FROM Author WHERE username like %:tags%", Author.class);
        query.setParameter("tags", tags);

        return query.getResultList();
    }
}
