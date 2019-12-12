package be.intecbrussel.servlet;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.tools.BCrypter;

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

        // If user is already logged in, redirect to home servlet, else, get register form
        // TODO instead of home servlet, redirect to the last visited page
        if (isLoggedIn != null && isLoggedIn){
            session.setAttribute("triedIllegalRegisterOrLoginAttempt", true);
            resp.sendRedirect("home");
        } else {
            req.getRequestDispatcher("resources/1-Front-End/login/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericMapper<Author> dao = new GenericMapper<>();
        HttpSession session = req.getSession();
        String username = req.getParameter("username");
        Author user = dao.getObject(new Author(), username);
        if (user == null){
            // Wrong username/pw combination
        } else {
            boolean isCorrectPassword = BCrypter.checkPassword(req.getParameter("password"), user.getPassword());
            if (isCorrectPassword){
                session.setAttribute("isLoggedIn", true);
                resp.sendRedirect("home");
            } else {
                // wrong username/pw
            }
        }

    }
}

