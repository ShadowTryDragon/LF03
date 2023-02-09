package exeptions;

public class GastNichtVorhandenException extends Exception {
    private int gastNr;

    public GastNichtVorhandenException(int gastNr) {
        this.gastNr = gastNr;

    }

    @Override
    public String getMessage() {
        return gastNr + "Ist nicht Vorhanden bitte überprüfen sie ihre Eingabe und versuchen sie es dann erneut";
    }
}
