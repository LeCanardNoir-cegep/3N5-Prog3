package org.pouliot.DemoJSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class SuperDuperDemo {
    static Document doc;
    public static void main(String arg[]) {
        try {
            doc = Jsoup.connect("http://perdu.com").get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(doc.title());
    }
}
