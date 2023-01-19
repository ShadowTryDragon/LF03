import java.util.ArrayList;
public class Zimmer {
    // Variabeln
    private int nr;
    private ArrayList<Gast> gastliste;
    //Konstruktor
    public Zimmer(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public ArrayList<Gast> getGastliste() {
        return gastliste;
    }

    public void checkIn(Gast gast) throws GastAlreadyCheckedInException {
 if (gastliste.isEmpty())
     gastliste.add(gast);
 else throw new GastAlreadyCheckedInException(gast);

    }
    public void checkOut(Gast gast) throws GastNotCheckedInException {
        if (getGastliste().contains(gast.getNachname()))
            gastliste.remove(gast);
        else throw new GastNotCheckedInException(gast);
    }

}
