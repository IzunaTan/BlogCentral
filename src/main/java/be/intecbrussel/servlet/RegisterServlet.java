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

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {
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
            req.getRequestDispatcher("resources/1-Front-End/signup/register.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the user's session
        HttpSession session = req.getSession();

        // Get all parameters from the register form
        String firstName = req.getParameter("first-name");
        String lastName = req.getParameter("last-name");
        String userName = req.getParameter("user-name");
        String email = req.getParameter("email");
        String street = req.getParameter("street");
        String houseNr = req.getParameter("house-number");
        String city = req.getParameter("city");
        String zipcode = req.getParameter("zip");
        // Instead of storing the password in plain text, we hash it with a powerful algorithm
        String password = BCrypter.hashPassword(req.getParameter("password"));


        // Create an new Author using a constructor with all the required fields
        Author author = new Author(userName, password, firstName, lastName, email);
        // Check every non required element and add them to the author if it's not an empty String
        // (prevents NumberFormatException for houseNr and Zipcode due to parsing a empty String if not checked
        if (!street.equals(""))
            author.setStreet(street);
        if (!houseNr.equals(""))
            author.setHouseNumber(Integer.parseInt(houseNr));
        if (!city.equals(""))
            author.setCity(city);
        if (!zipcode.equals(""))
            author.setZipCode(Integer.parseInt(zipcode));

        // Create an instance of the genericmapper user as the class
        GenericMapper<Author> dao = new GenericMapper<>();
        // Add the user to the database using the genericmapper object
        author = dao.addObject(author);

        // Set the user as logged in
        session.setAttribute("isLoggedIn", true);
        // Add the author object as attribute for further use
        session.setAttribute("author", author);
        // Redirect to home servlet
        // TODO Instead of redirecting to home servlet, redirect to the last page visited
        resp.sendRedirect("home");
    }

}
