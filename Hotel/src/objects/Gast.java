package objects;



public class Gast extends Person {

    private Adresse adresse;
    private int gastNr;

    public Gast(int gastNr, String vorname, String nachname, Adresse adresse){
        super(vorname, nachname);
        this.adresse = adresse;
        this.gastNr = gastNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return super.toString() + adresse.toString();
    }

    public int getGastNr() {
        return gastNr;
    }

    public void setGastNr(int gastNr) {
        this.gastNr = gastNr;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

}