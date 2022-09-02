package org.pouliot;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length == 0){
            System.out.println("Veuillez donner un argument de type string à l'application SVP!");
            System.exit(1);
        }

        String str = args[0];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            System.out.println( str.charAt(i) );
        }

    }
}
