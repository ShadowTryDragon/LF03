import java.util.ArrayList;

public class Etage {
    private String name;
    private ArrayList<Zimmer> zimmerListe;
    public Etage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }
    public int getAnzahlZimmer() {
       return zimmerListe.size();
    }
    public int getZimmerFrei() {
        return zimmerListe.size();
    }
    public int getAnzahlGaeste() {
        return ;

    }

}
