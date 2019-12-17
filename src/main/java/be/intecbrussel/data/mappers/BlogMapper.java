package be.intecbrussel.data.mappers;

import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class BlogMapper extends GenericMapper {
    public List<Blog> getBlogsByTags(String tags) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction et = em.getTransaction();

        et.begin();
        TypedQuery<Blog> query = em.createQuery("SELECT b FROM Blog WHERE title LIKE %:tags% OR message LIKE %:tags%", Blog.class);
        query.setParameter("tags", tags);

        return query.getResultList();
    }

}
