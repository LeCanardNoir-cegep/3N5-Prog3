package org.pouliot;

import java.io.*;
import java.util.Scanner;


public class LitFichier {
    public static void main (String[] args) throws IOException {
        if(args.length < 1){
            System.out.println("Besoin d'arguments");
            System.exit(1);
        }
        for (String a: args) {
            File f = new File(a);
            Scanner scan = new Scanner(f);
            System.out.println("Fichier: " + f.getName());
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
            System.out.println();
        }
    }
}
