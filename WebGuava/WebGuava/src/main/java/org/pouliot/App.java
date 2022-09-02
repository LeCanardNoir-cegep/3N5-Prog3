package org.pouliot;
import com.google.common.io.Resources;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.google.common.base.Charsets.UTF_8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        if(args.length == 0){
            System.out.println("Veuillez inclure une URL comme argument!");
            System.exit(1);
        }

        URL url = null;
        HttpURLConnection con = null;

        try {
            url = new URL(args[0]);
            con = (HttpURLConnection) url.openConnection();
// do some stuff with con, add headers, add request body, etc.
            con.getInputStream(); // get body of response
        }catch (IOException e){
            System.out.println("Veuillez fournir une URL valide!");
            System.exit(1);
        }



        String text = Resources.toString(con.getURL(), UTF_8);
        System.out.println(text);
        PrintWriter out = new PrintWriter("src/main/java/org/pouliot/result.html");
        out.print(text);
        out.close();
    }
}
