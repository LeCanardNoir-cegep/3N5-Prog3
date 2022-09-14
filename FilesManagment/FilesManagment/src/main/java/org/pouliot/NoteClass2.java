package org.pouliot;

import java.util.HashMap;
import java.util.Map;

public class NoteClass2 {

    public static Map<Integer, String> noteMap = new HashMap<Integer, String>() {
        @Override
        public String put(Integer key, String value) {
            return super.put(key, !this.containsKey(key) ? value : String.format("%s;%s", this.get(key), value));
        }

        @Override
        public String toString() {
            final String[] output = {""};
            forEach( (k,v) -> {
                String[] val = v.split(";");
                for (String s : val) {
                    output[0] += String.format("%s: %s\n", s, k);
                }
            } );
            return output[0];
        }
    };

    public static void main(String[] args) {
        noteMap.put(92, "Sanchez");
        noteMap.put(68, "Tremblay");
        noteMap.put(73, "Richard");
        noteMap.put(73, "Pouliot");
        noteMap.put(73, "trudeau");
        noteMap.put(73, "Tremblay");
        System.out.println(noteMap);
    }
}
