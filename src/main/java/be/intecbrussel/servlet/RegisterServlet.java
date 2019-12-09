package be.intecbrussel.servlet;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;

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
        HttpSession session = req.getSession();

        String firstName = req.getParameter("first-name");
        String lastName = req.getParameter("last-name");
        String userName = req.getParameter("user-name");
        String email = req.getParameter("email");
        String street = req.getParameter("street");
        String houseNr = req.getParameter("house-number");
        String city = req.getParameter("city");
        String zipcode = req.getParameter("zip");
        String password = req.getParameter("password");

        Author author = new Author(userName, password, firstName, lastName, email);
        if (!street.equals(""))
            author.setStreet(street);
        if (!houseNr.equals(""))
            author.setHouseNumber(Integer.parseInt(houseNr));
        if (!city.equals(""))
            author.setCity(city);
        if (!zipcode.equals(""))
            author.setZipCode(Integer.parseInt(zipcode));

        GenericMapper<Author> dao = new GenericMapper<>();
        author = dao.addObject(author);

        session.setAttribute("isLoggedIn", true);
        session.setAttribute("author", author);
        resp.sendRedirect("home");
    }
}
