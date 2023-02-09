package objects;

import objects.Behaelter;
import exeptions.BehaelterNichtGefundenExeption;
import objects.Lagerhalle;

import java.util.ArrayList;

public class Regal {
    Lagerhalle lagerhalle;
    ArrayList<Behaelter> behaelterListe;
    public Regal(Lagerhalle lagerhalle) {
        this.lagerhalle = lagerhalle;
        behaelterListe = new ArrayList<Behaelter>();
    }

    public ArrayList<Behaelter> getBehaelterListe() {
        return behaelterListe;
    }
    public void addBehaelter(Behaelter behaelter) {
        behaelterListe.add(behaelter);
    }
    public void removeBehalter(Behaelter behaelter) throws BehaelterNichtGefundenExeption {
        if (behaelterListe.contains(behaelter)) behaelterListe.remove(behaelter);
        else throw new BehaelterNichtGefundenExeption(behaelter.getBehaelterNr());

    }
public double getGewichtGesamt() {
        double gewichtGesamt = 0;
        for (Behaelter behaelter : behaelterListe)
            gewichtGesamt += behaelter.getGewichtBehaelter() + behaelter.getGewichtInhalt();
   return gewichtGesamt;
    }

    public int getAnzahlBehaelter() {
        return behaelterListe.size();
    }
    public Behaelter getBehaelter(String behaelterNr) throws BehaelterNichtGefundenExeption {
        Behaelter behaelter = null;
        for(Behaelter b : behaelterListe) {
            if (b.getBehaelterNr() == behaelterNr ) {
                behaelter = b;
            }
            if (behaelter == null) {
                throw new BehaelterNichtGefundenExeption(behaelterNr);
            }
        }
        return behaelter;
    }

    @Override
    public String toString() {
        String text;
        text = "behälterliste" + behaelterListe;
        return text;
    }
}