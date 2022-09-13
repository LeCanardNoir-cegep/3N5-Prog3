package org.pouliot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriSimple
{
    public static void main(String[] args){
        System.out.println(Tri(Arrays.asList(0.1, 12.34, 12.34, -0.1234, 3.1416)));
    }

    public static List<Double> Tri(List<Double> input){

        //input.sort( (a,b) ->  a.compareTo(b) );


        input.sort( (a,b) -> a < b ? -1 : 1 );

        return input;
    }

}
