package exeptions;

import objects.Gast;

public class GastNotCheckedInExeption extends Exception {
    private Gast gast;

    public GastNotCheckedInExeption(Gast gast) {
        this.gast = gast;
    }

    public String getMessage() {
        return gast.getVorname() + " " + gast.getNachname() + " ist nicht eingechecked";
    }
}