package be.intecbrussel.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Boolean triedIllegalRegisterOrLoginAttempt = (Boolean) session.getAttribute("triedIllegalRegisterOrLoginAttempt");
        if(!(triedIllegalRegisterOrLoginAttempt == null) && triedIllegalRegisterOrLoginAttempt) {
            resp.getWriter().println("<script> alert('You are already logged in') </script>");
            req.setAttribute("triedIllegalRegisterOrLoginAttempt", false);
        }

        resp.getWriter().println("Shits on fire yo bro");
    }
}
