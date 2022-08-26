package org.pouliot.UnUnSequence;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static int plusGrandNombre;
    static int iter;
    static boolean[] UnunPlusGrandQueSource;
    public static void main( String[] args )
    {
        String source = args.length > 0 && args[0].length() > 0 ? args[0] : "111213";
        int len = args.length > 0 && args[1].length() > 0 ? Integer.parseInt(args[1]) : 45;
        UnunPlusGrandQueSource = new boolean[len];

        UnUnSequence(source, len);
    }

    public static void UnUnSequence(String source, int longueur)
    {
        for (int i=0; i < longueur; i++){
            System.out.println(source);
            String unun = UnUn(source);

            UnunPlusGrandQueSource[i] = unun.length() < source.length();
            iter = i;

            source = unun;
            if(source.length() >= 99999) break;
        }
        System.out.println("\nLe plus grand nombre possible est: " + plusGrandNombre);
        System.out.println("Nombre d'itération fait: " + iter);
        System.out.println("Longueur de la chaine de caractère: " + source.length());

        boolean UnUnSource = false;
        for (boolean result: UnunPlusGrandQueSource) {
            UnUnSource = result || UnUnSource;
        }

        System.out.println("\nEst-ce qu'il arrive que le résultat de unUn soit plus court que la source? : " + (UnUnSource ? "vrai" : "faux"));
    }

    public static String UnUn(String source)
    {
        char[] scrArr = source.toCharArray();
        char currentChar = scrArr[0];
        int count = 0;
        String result= "";
        for (int i = 0; i < scrArr.length; i++) {
            if( scrArr[i] == currentChar ){
                count ++;
                result += i == scrArr.length -1 ? String.valueOf(count) + currentChar: "";
            }else{
                result += String.valueOf(count) + currentChar;
                count = 0;
                currentChar = scrArr[i];
                i --;
            }
            plusGrandNombre = count > plusGrandNombre ? count : plusGrandNombre;
        }
        return result;
    }
}
