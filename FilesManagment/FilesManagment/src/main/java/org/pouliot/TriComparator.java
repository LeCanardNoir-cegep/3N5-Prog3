package org.pouliot;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class TriComparator {

    public static void main(String[] args){
        System.out.println(
                triComplexe(Arrays.asList(1234, 747, 1977, -71, 17, 22))
        );
    }

    public static List<Integer> triComplexe(List<Integer> input){

        input.sort( (a,b) -> {
            int n7A = StringUtils.countMatches(String.valueOf(a), '7');
            int n7B = StringUtils.countMatches(String.valueOf(b), '7');
            return n7A < n7B ? -1 : 1;
        });
        return input;
    }
}
