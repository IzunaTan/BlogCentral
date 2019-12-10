package be.intecbrussel.data;

import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

// T can be any class
// TODO check if there is possibility of restricting T to [Comment, Blog, Author]
public class GenericMapper<T> {
    public T addObject(T obj) {
        // Get an entity manager
        EntityManager em = EntityManagerFactoryProvider.getEM();
        // Get the transaction linked to the entity manager
        EntityTransaction tx = em.getTransaction();

        // Start the transaction
        tx.begin();
        // Merge the object toward the database, pick it back up to get the auto increment id when applicable
        obj = em.merge(obj);
        // Commit the changes
        tx.commit();

        // Close your connection
        em.close();
        return obj;
    }

    public T removeObject(T obj) {
        // Get an entity manager
        EntityManager em = EntityManagerFactoryProvider.getEM();
        // Get the transaction linked to the entity manager
        EntityTransaction tx = em.getTransaction();

        // Start the transaction
        tx.begin();
        // To remove an object from the DB, it needs to be in the persistence context
        // By finding the object in the database, it gets added to the persistence context
        obj = (T) em.find(obj.getClass(), getId(obj));
        // Remove the just retrieved object from the database
        em.remove(obj);
        // Commit the changes
        tx.commit();

        // Close your connection
        em.close();
        return obj;
    }

    public T editObject(T obj) {
        // Get an entity manager
        EntityManager em = EntityManagerFactoryProvider.getEM();
        // Get the transaction linked to the entity manager
        EntityTransaction transaction = em.getTransaction();

        // Start the transaction
        transaction.begin();
        // To update an object in the database, it needs to be in the persistence context
        // By finding the object in the database, it gets added to the persistence context
        T dbObj = (T) em.find(obj.getClass(), getId(obj));
        // We use a clone method who will copy all parameter from our updated object, to the non update object
        // retrieved from the database
        cloneObject(dbObj, obj);
        // Merge the newly updated object from the database, back to the database
        em.merge(dbObj);
        // Commit the transaction
        transaction.commit();

        // Close your connection
        em.close();
        return dbObj;
    }

    public T getObject(T objTemplate, Object id) {
        // Get an entity manager
        EntityManager em = EntityManagerFactoryProvider.getEM();
        // Get the transaction linked to the entity manager
        EntityTransaction transaction = em.getTransaction();

        // Start the transaction
        transaction.begin();
        // Get the desired object from the database
        T dbObj = (T) em.find(objTemplate.getClass(), id);
        // Commit your transaction
        transaction.commit();

        // Close your connection
        em.close();
        return dbObj;
    }

    // Method used to determine what the id of the object is, since we have 3 possible classes
    // We need to know which class is our object, and use a different cast for each
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

    // Method used to determine which cast to do to use the clone method
    // We need to know which class is our object, and use a different cast for each
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
