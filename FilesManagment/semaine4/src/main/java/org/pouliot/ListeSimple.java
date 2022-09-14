package org.pouliot;

import java.util.ArrayList;
import java.util.List;

public class ListeSimple {
    public static void main(String[] args){
        System.out.println(Repete(4,2));
    }

    public static List<Integer> Repete(int n, int nRepete){
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < nRepete; j++) {
                numList.add(i);
            }
        }
        return numList;
    }
}
