package be.intecbrussel.servlet.get;

import be.intecbrussel.tools.SessionController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "blogdetail", value = "/blogdetail")
public class BlogDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        SessionController.addNewPageToSessionHistory(session, this.getServletName());

        req.getRequestDispatcher("resources/1-Front-End/commenting-system/commentingsystem.jsp").forward(req, resp);
    }
}
