package org.pouliot;

public class PasDansLaListe extends Exception {
    PasDansLaListe() {
    }

    PasDansLaListe(String elem) {
        super("La liste ne contient pas cet élément: " + elem);
    }
}
