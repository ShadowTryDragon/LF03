package objects;


public class Lagerhalle {
    Adresse adresse;
    private String name;
    private String lagerID;
    public Lagerhalle(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        String text;
        text = "Name des Lagers: " + name;
        text = "\n\t" + "objects.Adresse des Lagers" + adresse;
        return text;


    }

}
