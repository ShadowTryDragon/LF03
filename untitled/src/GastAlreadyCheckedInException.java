public class GastAlreadyCheckedInException extends Exception {
    private Gast gast;
    //Fehleraufbau
    public GastAlreadyCheckedInException(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        return gast + "Ist bereits eingecheckt";
    }
}
