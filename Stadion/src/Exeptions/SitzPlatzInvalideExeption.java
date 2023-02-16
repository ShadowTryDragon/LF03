package Exeptions;

public class SitzPlatzInvalideExeption extends Exception {
    private  int reihe;
    private int sitz;

    public SitzPlatzInvalideExeption(int reihe, int sitz) {
        this.reihe = reihe;
        this.sitz = sitz;
    }

    public int getReihe() {
        return reihe;
    }

    public int getSitz() {
        return sitz;
    }

    @Override
    public String getMessage() {
        System.out.println("Die angabe von SitzplatzNr " + getSitz() + " Reihe " + getReihe() + " ist Ungültig!" );
        return super.getMessage();
    }
}
