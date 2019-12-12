package be.intecbrussel.servlet;

import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.model.entities.Author;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the user's session
        HttpSession session = req.getSession();
        // Get whether or not the user is already logged in
        Boolean isLoggedIn = ((Boolean) session.getAttribute("isLoggedIn"));

        // If user is already logged in, redirect to home servlet, else, get login form
        // TODO instead of home servlet, redirect to the last visited page

        if (isLoggedIn != null && isLoggedIn) {
            session.setAttribute("triedIllegalRegisterOrLoginAttempt", true);
            resp.sendRedirect("home");
        } else {
            req.getRequestDispatcher("resources/1-Front-End/login/login.jsp").forward(req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the user's session
        HttpSession session = req.getSession();

        // Get all parameters from the login form
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // Check if email exists in database
        // GenericMapper class is not used here

        // Get an entity manager
        EntityManager em = EntityManagerFactoryProvider.getEM();
        // Get the transaction linked to the entity manager
        EntityTransaction transaction = em.getTransaction();

        // Start the transaction
        transaction.begin();
        // Get the desired object from the database
        TypedQuery<Author> authorHavingThisemail =
                em.createQuery("SELECT a FROM Author a WHERE a.password = :password", Author.class);
        if (authorHavingThisemail.equals(null)) {
            System.out.println("Null");
        } else {
            System.out.println("OKEY");
        }

        // Commit your transaction
        transaction.commit();

        // Close your connection
        em.close();
        resp.sendRedirect("home");
    }


}


