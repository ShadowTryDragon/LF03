package objects;

import exeptions.GastNichtVorhandenException;
import exeptions.GastVorhandenExeption;

import java.util.List;


public class Test {
    public static void main(String[] args)  {


        Adresse a1 = new Adresse("Drosselstraße", "11a", "28239", "Bremen");
        Gast g1 = new Gast(1331, "Peter", "Eduard", a1);
        GastDao gastDao = new GastDao();
        List<Gast> gastListe;
        System.out.println("--------------------------------");
        System.out.println("Leere Datenbank überprüfen");
        gastListe = gastDao.findAll();
        System.out.println("Anzahl: " + gastListe.size());
        System.out.println("--------------------------------");

        System.out.println("Datensatz Hinzufügen");
        try {
            gastDao.insert(g1);
            System.out.println("Hinzufügen erfolgreich");
            System.out.println("Der Gast " + g1.getVorname() + "  " + g1.getNachname() + " ist nun unter der ID " + " " + g1.getGastNr() + " registriert");
            System.out.println("--------------------------------");
        } catch (GastVorhandenExeption e) {
            System.out.println(e.getMessage());


        }
        System.out.println("Leere Datenbank überprüfen v2");
        gastListe = gastDao.findAll();
        System.out.println("Anzahl: " + gastListe.size());

        System.out.println("--------------------------------");
        System.out.println("Überprüfe ob " + " " + g1.getVorname() + "registriert ist");
        try {
            gastDao.findById(g1.getGastNr());
            System.out.println(g1.getGastNr() + " wurde gefunden ");
            System.out.println("Der Gast  " + g1.getVorname() + " " + g1.getNachname() + " ist unter der ID " + " " + g1.getGastNr() + "Registriert");
            System.out.println(" Er hat folgende Adresse(n) angegeben: " +  a1.getStrasse() + " " + a1.getHausNr() + " " + a1.getPlz() + " " +  a1.getOrt());
            System.out.println("--------------------------------");
        }
catch (GastNichtVorhandenException e) {
    System.out.println(e.getMessage());
}
}
    }
