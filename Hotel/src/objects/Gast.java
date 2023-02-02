package objects;

import exeptions.GastNichtVorhandenException;
import exeptions.GastVorhandenExeption;

import java.util.HashMap;
import java.util.Map;

public class Gast extends Person {

    private Adresse adresse;
    private String gastNr;

    public Gast(String gastNr, String vorname, String nachname, Adresse adresse){
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

    public String getGastNr() {
        return gastNr;
    }

    public void setGastNr(String gastNr) {
        this.gastNr = gastNr;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    Map<String, Gast> gastListe = new HashMap<>();

    public void insert(Gast gast) throws GastVorhandenExeption {
       if (gastListe.containsKey(gast.getGastNr())
       ) throw new GastVorhandenExeption(gastNr);
       else
           gastListe.put(gast.getGastNr(),gast);
    }
    public void update(Gast gast) throws  GastNichtVorhandenException {
        if (gastListe.containsKey(gastNr))
            gastListe.replace();
        else throw new GastNichtVorhandenException(gastNr);
    }
    public void delete(Gast gast) throws GastNichtVorhandenException {
        if (gastListe.containsKey(gast.getGastNr())
        ) throw new GastNichtVorhandenException(gastNr);
        else
            gastListe.remove(gast.getGastNr(),gast);
}}