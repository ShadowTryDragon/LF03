package exeptions;

public class GastVorhandenExeption extends Exception {
    private String gastNr;

    public GastVorhandenExeption(String gastNr) {
        this.gastNr = gastNr;
    }

    @Override
    public String getMessage() {
        return gastNr + "Ist bereits vorhanden";
    }
}
