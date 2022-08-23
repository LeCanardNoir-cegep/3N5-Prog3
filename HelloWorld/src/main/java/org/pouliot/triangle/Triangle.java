package org.pouliot.triangle;

public class Triangle {
    public static void main(String[] args) throws Exception
    {
        if(args.length == 0){
            System.out.println("Aucun argument trouvé!!!!!, RÉVEILLE DUDE!!!");
            return;
        }

        int  height = Integer.parseInt(args[0]);
        String str = "";
        int esc = height - 1;
        int step = 1;
        System.out.println();
        for (int i = 0; i < height; i++) {
            String rep = new String(new char[esc]).replace("\0", " ");
            str = new String(new char[step]).replace("\0", "*");
            step += 2;
            esc -= 1;
            System.out.println(rep + str);
        }
    }
}
