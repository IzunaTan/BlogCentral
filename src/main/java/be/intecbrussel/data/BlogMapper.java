package be.intecbrussel.data;

import be.intecbrussel.model.entities.Blog;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BlogMapper {
    public void addNewBlog(Blog blog) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(blog);
        tx.commit();
        em.close();
    }

    public void deleteBlog(Blog blog) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        // blog not in pc
        blog = em.find(Blog.class, blog.getId());
        // blog in pc
        em.remove(blog);
        tx.commit();
        em.close();
    }

    public void editBlog(Blog blog) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Blog dbBlog = em.find(Blog.class, blog.getId());
        dbBlog.cloneFrom(blog);
        em.merge(dbBlog);
        transaction.commit();

        em.close();
    }

    public Blog getBlog(int id) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Blog dbBlog = em.find(Blog.class, id);
        transaction.commit();

        em.close();
        return dbBlog;
    }
}
