package be.intecbrussel.servlet.post;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.data.mappers.BlogMapper;
import be.intecbrussel.data.mappers.CommentMapper;
import be.intecbrussel.exceptions.AuthorNotFoundException;
import be.intecbrussel.exceptions.AuthorNotLoggedInException;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;
import be.intecbrussel.tools.SessionController;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "sendcommentonpost", value = "/sendcommentonpost")
public class SendCommentOnPost extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        CommentMapper cm = new CommentMapper();

        SessionController.addNewPageToSessionHistory(session, this.getServletName(), req.getQueryString());

        if(!SessionController.isLoggedIn(session)){
            resp.sendRedirect("login");
        } else {

            String commentToAdd = req.getParameter("usercomment");

            if (!commentToAdd.trim().isEmpty()) {
                Integer blogID = Integer.valueOf(req.getParameter("id"));
                String authorName;
                try {
                    authorName = SessionController.getAuthor(session).getUsername();
                    cm.addCommentToBlog(blogID, authorName, commentToAdd);
                } catch (AuthorNotLoggedInException e) {
                    //shoudlnt happen
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
            resp.sendRedirect(SessionController.getLastPage(session));
        }
    }
}
