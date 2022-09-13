package org.pouliot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args){
        Truc a = new Truc(1,"AAA");
        Truc b = new Truc(2,"BBB");
        Truc c = new Truc(3,"CCC");

        List<Truc> list1 = Arrays.asList( a,b,c );
        List<Truc> list2 = Arrays.asList( b,c,a );

        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

        a.pipo = 4; a.popi = "wtf";

        System.out.println(list1);
        System.out.println(list2);
    }
}
