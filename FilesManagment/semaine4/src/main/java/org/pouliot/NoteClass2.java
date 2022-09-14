package org.pouliot;

import java.util.HashMap;
import java.util.Map;

public class NoteClass2 {

    public static Map<Integer, String> noteMap = new HashMap<Integer, String>() {
        @Override
        public String put(Integer key, String value) {
            return super.put(
                    key,
                    String.format("%s, %s", this.get(key), value)
            );
        }

        @Override
        public String toString() {
            StringBuilder outStr = new StringBuilder();
            this.forEach((k, v) -> {
                String[] str = v.split(",");
                for (String item : str) {
                    outStr.append(item + ": " + k);
                }
            });
            return outStr.toString();
        }
    };

    public static void main(String[] args) {
        noteMap.put(92, "Sanchez");
        noteMap.put(68, "Tremblay");
        noteMap.put(73, "Richard");
        System.out.println(noteMap);
    }
}
