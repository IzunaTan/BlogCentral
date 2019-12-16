package be.intecbrussel.servlet.get;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.exceptions.AuthorNotFoundException;
import be.intecbrussel.exceptions.PasswordInvalidException;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.tools.BCrypter;
import be.intecbrussel.tools.JavaScriptGenerator;
import be.intecbrussel.tools.SessionModifier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        // Adds the current page to the page history
        SessionModifier.addNewPageToSessionHistory(session, this.getServletName());

        // Check if user is already logged in, if yes, use alert box and send them back to their last visited page
        if (SessionModifier.isLoggedIn(session)) {
            resp.sendRedirect("AlreadyLoggedIn");
        }

        // Check if user just inputted invalid username or password, if yes, use alert box and load the login page
        else if (SessionModifier.isInvalidCredentialsFlagSet(session)) {
            String alert = JavaScriptGenerator.generateAlertBox("Invalid username and password combination");
            resp.getWriter().println(alert);
            SessionModifier.removeInvalidCredentialsFlag(session);
            req.getRequestDispatcher("resources/1-Front-End/login/login.jsp").forward(req, resp);
        }

        // Load the login page
        else {
            req.getRequestDispatcher("resources/1-Front-End/login/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();

        // Make a author mapper using the generic mapper
        GenericMapper<Author> authorMapper = new GenericMapper<>();

        // Get the username and password from the login form
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            // Get the author with corresponding username from the database
            Author author = authorMapper.getObject(new Author(), username);
            // Verify that the inputted password is correct
            boolean correctPassword = BCrypter.checkPassword(password, author.getPassword());

            // If the password is incorrect, exception \o/
            if (!correctPassword)
                throw new PasswordInvalidException();

            // Log the user in
            SessionModifier.logsIn(session, author);
            // Send the user back to the last visited page
            resp.sendRedirect(SessionModifier.getLastPage(session));
        }

        // If the username was incorrect, or the password didn't match, we would end up arriving here
        catch (AuthorNotFoundException | PasswordInvalidException e) {
            // Sets the invalid credential flag on true
            SessionModifier.setInvalidCredentialsFlag(session);
            // Send the user back to the login page
            resp.sendRedirect("login");
        }

    }


}
