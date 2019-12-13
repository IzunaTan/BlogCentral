package be.intecbrussel.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ajouter anotation webservlet
        // recup le parametre du req
        // cree un method searchObject dans generic mapper (also make blog query for b.title ( check branch ulas https://github.com/IzunaTan/BlogCentral/blob/ulas/src/main/java/be/intecbrussel/data/GenericMapper.java)
        // test avec un sysout dans un foreach
        // affiche le home jsp
    }
}
