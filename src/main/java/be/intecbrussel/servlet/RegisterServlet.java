package be.intecbrussel.servlet;

import be.intecbrussel.data.BlogMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Boolean isLoggedIn = ((Boolean) session.getAttribute("isLoggedIn"));

        if (isLoggedIn != null && isLoggedIn){
            session.setAttribute("triedIllegalRegisterOrLoginAttempt", true);
            resp.sendRedirect("home");
        } else {
            req.getRequestDispatcher("resources/1-Front-End/signup/register.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("first-name");
        String lastName = req.getParameter("last-name");
        String userName = req.getParameter("user-name");
        String email = req.getParameter("email");
        String street = req.getParameter("street");
        Integer houseNr = Integer.parseInt(req.getParameter("house-number"));
        String city = req.getParameter("city");
        Integer zipcode = Integer.parseInt(req.getParameter("zip"));
        String password = req.getParameter("password");
        String password2 = req.getParameter("retype-password");
        Author momo = new Author(userName, password, firstName, lastName, email, street, houseNr, city, zipcode);
        System.out.println(momo);
    }
}
