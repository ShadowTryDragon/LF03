import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private ArrayList<Etage> etagenListe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }
    public int getAnzahlEtagen() {
        return etagenListe.size();
    }
}

