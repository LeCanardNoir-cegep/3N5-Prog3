package org.pouliot;

public class Truc {
    int pipo;
    String popi;

    public Truc(int pipo, String popi) {
        this.pipo = pipo;
        this.popi = popi;
    }

    @Override
    public String toString() {
        return String.format("Truc{ pipo=%s,popi='%s'}", pipo, popi);
    }
}
