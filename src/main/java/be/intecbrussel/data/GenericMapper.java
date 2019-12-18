package be.intecbrussel.data;

import be.intecbrussel.exceptions.AuthorNotFoundException;
import be.intecbrussel.model.EntityInterface;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

// Uses T extends interface so the only classes T can be are Author Blog and Comments
public class GenericMapper<T extends EntityInterface> {
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
        obj = (T) em.find(obj.getClass(), obj.getId());
        em.remove(obj);
        tx.commit();

        em.close();
        return obj;
    }

    public T editObject(T obj) {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        T dbObj = (T) em.find(obj.getClass(), obj.getId());
        dbObj.cloneFrom(obj);
        em.merge(dbObj);
        transaction.commit();

        em.close();
        return dbObj;
    }

    public T getObject(T objTemplate, Object id) throws AuthorNotFoundException {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        T dbObj = (T) em.find(objTemplate.getClass(), id);
        if (dbObj == null)
            throw new AuthorNotFoundException();
        transaction.commit();

        em.close();
        return dbObj;
    }

    //    public List<T> getObjectsAsList(T obj,int indexId, int offset) {
//
//        EntityManager em = EntityManagerFactoryProvider.getEM();
//        EntityTransaction transaction = em.getTransaction();
//
//        transaction.begin();
//        T dbObj = (T) em.find(obj.getClass(), indexId);
//        if (dbObj == null)
//            throw new AuthorNotFoundException();
//        transaction.commit();
//
//        em.close();
//        return dbObj;
//    }
}
