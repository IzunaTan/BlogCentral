package be.intecbrussel.tools;

public class JavaScriptGenerator {
    public static String generateAlertBox(String msg) {
        return "<script> window.alert('" + msg + "')</script>";
    }

}
