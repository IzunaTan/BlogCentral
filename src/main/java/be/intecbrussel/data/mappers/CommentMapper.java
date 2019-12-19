package be.intecbrussel.data.mappers;

import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class CommentMapper extends GenericMapper {
    public List<Comment> getCommentsFromTags(String tags){
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction et = em.getTransaction();

        et.begin();
        TypedQuery<Comment> query = em.createQuery("SELECT c FROM Comment c WHERE c.message LIKE :tags", Comment.class);
        query.setParameter("tags", "%"+tags+"%");
        List<Comment> list = query.getResultList();

        em.close();
        return list;
    }
}
