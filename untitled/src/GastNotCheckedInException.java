public class GastNotCheckedInException extends Exception {
    private Gast gast;
    //Fehleraufbau
    public GastNotCheckedInException(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        return gast + "Ist bereits ausgecheckt oder ist nicht vorhanden";
    }
}
