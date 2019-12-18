package be.intecbrussel.listeners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

// TODO testing this thing in one way or another
// TODO learn about session TTL
public class SessionListener implements HttpSessionListener {
    // A list containing all sessions online
    private static final List<HttpSession> sessionList = new ArrayList<>();

    @Override
    // When a user is online (session online), add it to the list
    public void sessionCreated(HttpSessionEvent se) {
        sessionList.add(se.getSession());
    }

    @Override
    // When a user is offline (session offline/dead) remove it from the list
    public void sessionDestroyed(HttpSessionEvent se) {
        sessionList.remove(se.getSession());
    }

    // Retrieve the amount of active sessions (people online)
    public static int amountOfActiveSessions() {
        return sessionList.size();
    }
}
