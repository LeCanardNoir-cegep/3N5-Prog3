package org.pouliot;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String RESET = "\u001B[0m" ;
    private static final String RED = "\u001B[31m" ;
    private static final String YELLOW = "\u001B[33m" ;
    private static final String GREEN = "\u001B[32m" ;
    public static void main( String[] args )
    {
        int iNum = 10;
        System.out.println("int en float: " + GREEN + (float) iNum + RESET);
        System.out.println("int en String: " + GREEN + String.valueOf(iNum) + RESET );

        double dNum = 19.993654d;
        System.out.println("double en int: " + GREEN + (int) dNum  + RESET);

        float fNum = 19.99f;
        System.out.println("float en double: " + GREEN + (double) fNum  + RESET);

        String sNum = "19";
        String sChar = "burN@";
        System.out.println("String en int: " + GREEN + Integer.parseInt(sNum)  + RESET );
        try{
            System.out.println("String en int: " + Integer.parseInt(sChar) );
        }catch (NumberFormatException e){
            System.out.println("\nString en int:\n" + YELLOW + "Qu'est-ce qui se passe s'il y a autre chose que des chiffres ?" + RESET);
            System.out.println(RED + "Error: " + RESET + e);
        }


    }
}
