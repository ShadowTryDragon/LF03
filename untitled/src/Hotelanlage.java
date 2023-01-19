import java.util.ArrayList;

public class Hotelanlage {
    private String name;
    Adresse adresse;
    private ArrayList<Gebaeude> gebaeudeListe;
    public Hotelanlage( String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
        this.gebaeudeListe = new ArrayList<Gebaeude>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public int getAnzahlZimmer() {
        int anzahl = 0;
        for (Gebaeude gebaeude : gebaeudeListe) {
            anzahl += gebaeude.getAnzahlEtagen();
            return anzahl

        }
    }
}
