package org.pouliot;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] tab = {"moi j'ai un chat pas de poils", "Ton chien est vraiment épais", "twit", "mangeux de merde", "Arrête---TE", "bébé"};
        try {
            System.out.println(Trouver.trouve(tab, "bébé"));
            System.out.println(Trouver.trouve(tab, "pas la"));
        } catch (PasDansLaListe e) {
            System.out.println(e.getMessage());
        }
    }
}
