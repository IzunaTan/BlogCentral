package be.intecbrussel.listeners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

public class SessionListener implements HttpSessionListener {
    private static List<HttpSession> sessionList = new ArrayList<>();

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        sessionList.add(se.getSession());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        sessionList.remove(se.getSession());
    }

    public static int amountOfActiveSessions(){
        return sessionList.size();
    }
}
