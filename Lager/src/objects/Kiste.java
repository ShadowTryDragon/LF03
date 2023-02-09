package objects;

import objects.Behaelter;

public class Kiste extends Behaelter {
    public double laenge;
    public double breite;
    public Kiste(String behaelterNr, double gewichtBehaelter, double gewichtInhalt, double gewichtInhaltMax, double laenge, double breite) {
        super(behaelterNr, gewichtBehaelter, gewichtInhalt, gewichtInhaltMax);
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public String toString() {
       String text;
       text = super.toString();
        text = text + "\n\t" + "Breite der objects.Kiste: " + breite;
        text = text + "\n\t" + "Länge der objects.Kiste: " + laenge;
       return  text;
    }
}
