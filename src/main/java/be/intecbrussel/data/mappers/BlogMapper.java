package be.intecbrussel.data.mappers;

import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class BlogMapper extends GenericMapper {
    public List<Blog> getBlogsByTags(String tags) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction et = em.getTransaction();

        et.begin();
        TypedQuery<Blog> query = em.createQuery("SELECT b FROM Blog b WHERE b.title LIKE :tags OR b.message LIKE :tags", Blog.class);
        query.setParameter("tags", "%"+tags+"%");
        List<Blog> list = query.getResultList();

        em.close();
        return list;
    }

    public void addCommentToBlog(Integer blogID, String nameAuthor, String comment){
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Blog dbObj = em.find(new Blog().getClass(), blogID);
        Author dbAuthor = em.find(new Author().getClass(), nameAuthor);
        dbObj.addComments(new Comment(dbAuthor, comment));
        em.merge(dbObj);
        transaction.commit();

        em.close();
    }

}
