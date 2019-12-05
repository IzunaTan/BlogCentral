package be.intecbrussel.data;

import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CommentMapper {
    public void addNewComment(Comment comment) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(comment);
        tx.commit();
        em.close();
    }

    public void deleteComment(Comment comment) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(comment);
        tx.commit();
        em.close();
    }

    public void editComment(Comment comment) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Comment dbComment = em.find(Comment.class, comment.getId());
        dbComment.cloneFrom(comment);
        transaction.commit();

        em.close();
    }

    public Comment getComment(int id) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Comment dbComment = em.find(Comment.class, id);
        transaction.commit();

        em.close();
        return dbComment;
    }
}
