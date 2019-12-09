package be.intecbrussel.data;

import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GenericMapper<T> {
    public T addObject(T obj) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        obj = em.merge(obj);
        tx.commit();

        em.close();
        return obj;
    }

    public T removeObject(T obj) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        obj = (T) em.find(obj.getClass(), getId(obj));
        em.remove(obj);
        tx.commit();

        em.close();
        return obj;
    }

    public T editObject(T obj) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        T dbObj = (T) em.find(obj.getClass(), getId(obj));
        cloneObject(dbObj, obj);
        em.merge(dbObj);
        transaction.commit();

        em.close();
        return dbObj;
    }

    public T getObject(T objTemplate, Object id) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        T dbObj = (T) em.find(objTemplate.getClass(), id.toString());
        transaction.commit();

        em.close();
        return dbObj;
    }

    private Object getId(T obj) {
        Object objId;

        if (obj instanceof Blog)
            objId = ((Blog) obj).getId();
        else {
            if (obj instanceof Author)
                objId = ((Author) obj).getUsername();
            else
                objId = ((Comment) obj).getId();
        }

        return objId;
    }

    private void cloneObject(T dbObj, T obj){
        if (obj instanceof Blog)
            ((Blog) dbObj).cloneFrom((Blog) obj);
        else {
            if (obj instanceof Author)
                ((Author) dbObj).cloneFrom((Author) obj);
            else
                ((Comment) dbObj).cloneFrom((Comment) obj);
        }
    }
}
