package org.pouliot;

public class Personne {
    public String name = "Bruno";
    public int salaire = 46000;

    @Override
    public String toString() {
        return String.format("Personne\nNom: %s", this.name);
    }
}
