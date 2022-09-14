package org.pouliot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteClass {
    public static Map<Integer, List<String>> noteMap = new HashMap<>();
    public static void main(String[] args){

        addStuden(92, "Sanchez");
        addStuden(68, "Tremblay");
        addStuden(68, "Sasa");
        addStuden(73, "Richard");
        addStuden(30, "Tremblay");

        System.out.println(noteMap);
        System.out.println();

        printResume();
    }

    public static void addStuden(int note, String Studen){
        if(!noteMap.containsKey(note)) noteMap.put(note, new ArrayList<>());
        noteMap.get(note).add(Studen);
    }

    public static void printResume(){
        noteMap.forEach( (k,v) -> v.forEach( s -> System.out.println(s + ": " + k) ) );
    }

}
