package org.pouliot;

import org.magicwerk.brownies.collections.GapList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Random random = new Random(1234);
        int num = random.nextInt(1000000000);
        int count = 10000;

        System.out.println( "ArrayList" );
        long a = testeCetteList(new ArrayList<Integer>(), num, count);
        System.out.println(  );
        System.out.println( "LinkedList" );
        long b = testeCetteList(new LinkedList<Integer>(), num, count);
        System.out.println(  );
        System.out.println( "Gaplist" );
        long c = testeCetteList(new GapList<Integer>(), num, count);

        System.out.println("\n\nNumber: " + num);
        System.out.println("total temps: " + (a+b+c) +"ms");
        System.out.println("ArrayList:\t" + a + "ms \t| " + (a*100/(a+b+c)) + "% du temps");
        System.out.println("LinkedList:\t" + b + "ms \t| " + (b*100/(a+b+c)) + "% du temps");
        System.out.println("Gaplist:\t" + c + "ms \t| " + (c*100/(a+b+c)) + "% du temps");
    }
    public static long testeCetteList(List<Integer> liste, int num, int count){
        Random random = new Random(1234);
        long a = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            liste.add(num);
        }
        long b = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            liste.add(0, num);
        }
        long c = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            liste.add(random.nextInt(liste.size()), num);
        }
        long d = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            liste.add(liste.size(), num);
        }
        System.out.println("add(num):\t\t\t" + (b-a));
        System.out.println("add(0, num):\t\t" + (c-b));
        System.out.println("add(random, num):\t" + (d-c));

        return d-a;
    }
}
