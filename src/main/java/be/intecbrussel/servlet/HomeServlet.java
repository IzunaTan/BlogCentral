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
        // Get the user's session
        HttpSession session = req.getSession();
        // Get whether the user is coming from a login or register page while being already logged in
        Boolean triedIllegalRegisterOrLoginAttempt = (Boolean) session.getAttribute("triedIllegalRegisterOrLoginAttempt");

        // If the user tried to go to the login or register page while already being logged in, display an alert box
        // saying the user is already logged in, and set the attribute to false
        if(!(triedIllegalRegisterOrLoginAttempt == null) && triedIllegalRegisterOrLoginAttempt) {
            resp.getWriter().println("<script> alert('You are already logged in') </script>");
            req.setAttribute("triedIllegalRegisterOrLoginAttempt", false);
        }

        // Shit's on fire yo
        resp.getWriter().println("Shits on fire yo bro");
    }
}
