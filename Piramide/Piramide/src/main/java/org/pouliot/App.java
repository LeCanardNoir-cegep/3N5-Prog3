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
            System.out.println("Veuillez donner un nombre en paramètre.");
            System.exit(1);
        } else if ( Integer.parseInt(args[0]) < 2 ) {
            System.out.println("Veuillez donner un nombre plus grand que 1 en paramètre.");
            System.exit(1);
        }
        int limit = Integer.parseInt(args[0]);
        FullPiramid(limit);
        System.out.println();
        EmptyPiramid(limit);
    }
    public static void FullPiramid(int limit)
    {
        String space = "";
        String star = "*";
        for (int i = 1; i <= limit; i++){
            space = new String(new char[limit-i]).replace("\0"," ");
            System.out.println(space + star);
            star += "**";
        }
    }

    public static void EmptyPiramid(int limit)
    {
        String space = "";
        String star = "*";
        for (int i = 1; i <= limit; i++){
            if(i == 1){
                space = new String(new char[limit-i]).replace("\0"," ");
                System.out.println(space + star);
            } else if (i==limit) {
                star = new String(new char[limit*2-1]).replace("\0", "*");
                System.out.println(star);
            }else {
                star = "*" + new String(new char[i*2-3]).replace("\0"," ") + "*";
                space = new String(new char[limit-i]).replace("\0"," ");
                System.out.println(space + star);
            }
        }
    }
}
