package org.pouliot;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int len = 10;
        int num = 0;
        for (int i = 0; i < len; i++) {
            num = (int) ( Math.rint(Math.random()*10000) );
            String m1 = intToBin(num);
            String m2 = Integer.toBinaryString(num);
            System.out.println("-------------------------------------------------------");
            System.out.println("Nombre: " + num);
            System.out.println("intToBin: " + m1 );
            System.out.println( "Integer.toBinaryString: " + m2 );
            System.out.println( "Les methods sont équivalentes? "+ (m1.compareTo(m2) == 0 ? "VRAI" : "FAUX") );
            System.out.println();
        }
    }

    public static String intToBin(int num){
        String sBin ="";
        while(num>0){
            int rest = Math.floorMod(num, 2);
            num = Math.floorDiv(num, 2);
            sBin = String.valueOf(rest) + sBin;
        }

        return sBin;
    }
}
