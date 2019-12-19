package be.intecbrussel.data.mappers;

import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    public void addCommentToBlog(Integer blogID, String authorName, String commentToAdd) throws ClassNotFoundException, SQLException {
        EntityManager em = EntityManagerFactoryProvider.getEM();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Comment com = new Comment(em.find(new Author().getClass(), authorName), commentToAdd);
        com = em.merge(com);
        addConnectionViaJDBC(blogID, com.getId());
        et.commit();
    }

    private void addConnectionViaJDBC(Integer blogID, Object id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blogcentral?serverTimezone=UTC", "intecpotato", "grp")){
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Blog_Comment VALUES (?, ?)");
            ps.setInt(1, blogID);
            ps.setInt(2, (Integer) id);
            ps.execute();
        }
    }
}
