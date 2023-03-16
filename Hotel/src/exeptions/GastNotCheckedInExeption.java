package exeptions;

import objects.Gast;

public class GastNotCheckedInExeption extends Exception {
    private Gast gast;

    public GastNotCheckedInExeption(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        System.out.println( gast.getVorname() + " " + gast.getNachname() + " ist nicht eingechecked bitte überprüfe ob du vielleicht einen Tippfehler hattest");
        return super.getMessage();
    }
}

