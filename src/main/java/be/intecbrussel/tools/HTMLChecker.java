package be.intecbrussel.tools;

import org.apache.commons.text.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

public class HTMLChecker {
    // This method deletes all script tags from a String, disabling the possibility of executing javascript on blog
    // TODO: shit aint working
    public static String onlyAllowIFrames(String text) {
        Whitelist whitelist = Whitelist.none();
        whitelist.addTags("p","br","ul");

        String safe = Jsoup.clean(text, whitelist);
        System.out.println("after clear -> " + safe);
        return StringEscapeUtils.unescapeXml(safe);
    }
}
