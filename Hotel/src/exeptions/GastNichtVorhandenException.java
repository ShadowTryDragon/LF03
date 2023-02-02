package exeptions;

public class GastNichtVorhandenException extends Exception {
    private String gastNr;

    public GastNichtVorhandenException(String gastNr) {
        this.gastNr = gastNr;

    }

    @Override
    public String getMessage() {
        return gastNr + "Ist nich Vorhanden";
    }
}
