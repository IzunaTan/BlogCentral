package be.intecbrussel.servlet.get;

import be.intecbrussel.tools.SessionModifier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "home", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the user's session
        HttpSession session = req.getSession();
        // Adds the current page to page history
        SessionModifier.addNewPageToSessionHistory(session, this.getServletName());
        // Load the home page
        req.getRequestDispatcher("resources/1-Front-End/home/index.jsp").forward(req, resp);
    }
}

