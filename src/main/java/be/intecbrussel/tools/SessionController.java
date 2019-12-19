package be.intecbrussel.tools;

import be.intecbrussel.exceptions.AuthorNotLoggedInException;
import be.intecbrussel.model.entities.Author;

import javax.servlet.http.HttpSession;

public class SessionController {
    public static void addNewPageToSessionHistory(HttpSession session, String servletName, String query) {
        String currentPage = (String) session.getAttribute("currentPage");
        String urlWithParams = (query == null || query.isEmpty()) ? servletName : servletName.concat("?").concat(query);
        if (currentPage == null) {
            session.setAttribute("lastPage", "home");
            session.setAttribute("currentPage", urlWithParams);
        }
        else if (servletName.equals("login") || servletName.equals("register") || servletName.equals("logout") || servletName.equals("sendcomment") || servletName.equals("deletecomment"))
            session.setAttribute("lastPage", currentPage);
        else {
            session.setAttribute("lastPage", session.getAttribute("currentPage"));
            session.setAttribute("currentPage", urlWithParams);
        }



        System.out.println("Last Page -> " + session.getAttribute("lastPage"));
        System.out.println("Current Page -> " + session.getAttribute("currentPage"));

    }

    public static Boolean isLoggedIn(HttpSession session) {
        Object o = session.getAttribute("isLoggedIn");
        if (o == null)
            o = false;
        return (Boolean) o;
    }

    public static void logsIn(HttpSession session, Author author) {
        session.setAttribute("isLoggedIn", true);
        session.setAttribute("Author", author);
    }

    public static void logsOut(HttpSession session) {
        session.setAttribute("isLoggedIn", false);
        session.setAttribute("Author", null);
    }

    public static Author getAuthor(HttpSession session) throws AuthorNotLoggedInException {
        if (isLoggedIn(session)) {
            return (Author) session.getAttribute("Author");
        } else {
            throw new AuthorNotLoggedInException();
        }
    }

    public static Boolean isInvalidCredentialsFlagSet(HttpSession session) {
        Object o = session.getAttribute("invalidCredentials");
        if (o == null)
            o = false;
        return (Boolean) o;
    }

    public static void setInvalidCredentialsFlag(HttpSession session) {
        session.setAttribute("invalidCredentials", true);
    }

    public static void removeInvalidCredentialsFlag(HttpSession session) {
        session.setAttribute("invalidCredentials", false);
    }

    public static String getLastPage(HttpSession session) {
        String lastPage = (String) session.getAttribute("lastPage");
        if (lastPage == null)
            lastPage = "home";
        return lastPage;
    }

    public static String getCurrentPage(HttpSession session) {
        String currentPage = (String) session.getAttribute("currentPage");
        if (currentPage == null)
            currentPage = "home";
        return currentPage;
    }

}
