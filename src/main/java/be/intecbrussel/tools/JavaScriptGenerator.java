package be.intecbrussel.tools;

public class JavaScriptGenerator {
    public static String generateAlertBox(String msg) {
        return "<script> window.alert('" + msg + "')</script>";
    }

    public static String generateAlertBoxAndRedirect(String msg, String redirectLink) {
        String alert = "<script> window.alert('" + msg + "');\n";
        String redirect = "window.location.replace('" + redirectLink + "')</script";
        return alert.concat(redirect);
    }

}
