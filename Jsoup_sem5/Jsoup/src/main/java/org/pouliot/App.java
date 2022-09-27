package org.pouliot;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * semaine 5 jsoup
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String url = "https://info.cegepmontpetit.ca/3N5-Prog3/";
        Document html = Jsoup.connect(url).get();
        Elements links = html.getElementsByTag("a");
        links.forEach( l -> System.out.println(l.toString()) );
    }
}
