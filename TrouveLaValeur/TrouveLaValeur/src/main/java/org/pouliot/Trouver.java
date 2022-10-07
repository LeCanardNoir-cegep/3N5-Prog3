package org.pouliot;

import java.util.Arrays;

public class Trouver {
    public static Integer trouve(String[] tab, String search) throws PasDansLaListe {
        int index = -1;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == search){
                index = i;
                break;
            }
        }

        if(index < 0){
            throw new PasDansLaListe(search);
        }

        return index;
    }

}


