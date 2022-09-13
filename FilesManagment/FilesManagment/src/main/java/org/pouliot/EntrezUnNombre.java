package org.pouliot;

import java.util.Scanner;

public class EntrezUnNombre {
    public static void main(String[] args){
        System.out.println("Veuillez entrer un nombre:");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()){
            System.out.println("Ceci n’est pas un nombre, veuillez entrer un nombre:");
            scan = new Scanner(System.in);
        }
        System.out.println("Merci votre nombre est: " + scan.nextInt());
    }
}
