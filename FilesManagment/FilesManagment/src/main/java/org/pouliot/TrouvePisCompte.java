package org.pouliot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrouvePisCompte {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numList.add(random.nextInt(10));
        }
        int num = random.nextInt(10);
        System.out.println("Recherché (" + num + "): " + (trouve(num, numList) ? "trouvé" : "Non trouvé"));
        System.out.println("Nombre de fois: " + compte(num, numList));
        System.out.println(numList);
    }

    public static boolean trouve(int elem, List<Integer> list){
        return list.contains(elem);
    }

    public static int compte(int elem, List<Integer> list){
        return (int) list.stream().filter(i -> i.equals(elem) ).count();
    }
}
