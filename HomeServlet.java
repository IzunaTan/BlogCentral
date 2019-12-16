package be.intecbrussel.servlet.get;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.exceptions.AuthorNotFoundException;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.tools.SessionController;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "home", value = "/home")
public class HomeServlet extends HttpServlet {
    int counter=0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the user's session
        HttpSession session = req.getSession();

           // Create an instance of the genericmapper user as the class
        GenericMapper<Blog> dao = new GenericMapper<>();
        Blog blog=new Blog();

          // Create list of cards to be read from database
        List<Blog> blogsDynamic=new ArrayList<>();
        List<Integer>noOfComments=new ArrayList<>();
        List<Integer>noOfLikes=new ArrayList<>();

        // Read first 6 blogs from blogcentral database
        for (int i = 1; i < 6; i++) {

            try {

                Blog blogRead = dao.getObject(blog, i);
                blogsDynamic.add(blogRead);
                noOfComments.add(blogRead.getComments().size());
                noOfLikes.add(0);

            } catch (AuthorNotFoundException e) {
                e.printStackTrace();
            }
        }


        req.setAttribute("blogsDynamic",blogsDynamic);
        req.setAttribute("visitcounter",counter++);
        req.setAttribute("noofcomments",noOfComments);
        req.setAttribute("nooflikes",noOfLikes);



        // Adds the current page to page history
        SessionController.addNewPageToSessionHistory(session, this.getServletName());
        // Load the home page
        req.getRequestDispatcher("resources/1-Front-End/home/index-copy.jsp").forward(req, resp);

    }
}
