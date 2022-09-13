package org.pouliot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EcritFichier {
    public static void main(String[] args) throws IOException {
        File currentPath = new File("src/main/java/org/pouliot");
        System.out.println(currentPath.getPath());

        File parentPath = new File(currentPath.getParent());
        System.out.println(parentPath.getPath());

        File emptyFile = new File(currentPath,"vide.txt");
        emptyFile.createNewFile();

        FileWriter fw = new FileWriter(parentPath.getPath() + "/myName.txt");
        fw.write("Bruno Pouliot");
        fw.close();
    }
}
