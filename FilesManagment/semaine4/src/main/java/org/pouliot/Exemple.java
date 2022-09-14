package org.pouliot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Exemple
{
    public static void main( String[] args )
    {
        try {
            // WRITE FILE
            String path = "src/main/java/org/pouliot/test/test1/test2/test3/final/";
            String file = path + "test.txt";
            File dir = new File(path);
            System.out.println("Dir create: " + dir.mkdirs());
            int lines = 0;
            try (Stream<String> stream = Files.lines(Paths.get(file))){
                lines = (int) stream.count();
            }
            FileWriter fwa = new FileWriter(file, true);
            for (int i = lines; i < lines+5; i++) {
                fwa.write("test" + i + "\n");
            }
            fwa.close();

            // READ FILE
            File f = new File(path, "test.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
