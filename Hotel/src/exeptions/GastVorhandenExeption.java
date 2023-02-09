package exeptions;

public class GastVorhandenExeption extends Exception {
    private int gastNr;

    public GastVorhandenExeption(int gastNr) {
        this.gastNr = gastNr;
    }

    @Override
    public String getMessage() {
        return gastNr + "Ist bereits im System vorhanden";
    }
}
