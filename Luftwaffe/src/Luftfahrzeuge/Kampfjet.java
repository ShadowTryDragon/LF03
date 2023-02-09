package Luftfahrzeuge;



import Waffen.Abwehrmassnahmen;
import Waffen.Bomben;
import Waffen.Geschuetz;

public class Kampfjet implements Fluggeraete, Bomben, Geschuetz, Abwehrmassnahmen {

// Fluggeraete
    @Override
    public void bezeichnung() {
        System.out.println("A10 - Thunderbolt");
    }

    @Override
    public void kennung() {
        System.out.println("A10-55K");
    }

    @Override
    public void Typ() {
        System.out.println("Militärflugzeug");
    }
    // Bomben
    @Override
    public void bombenart() {
        System.out.println("Streu");
    }

    @Override
    public void anzahlbomben() {
        System.out.println("50");
    }


    // Geschuetz
    @Override
    public void waffenbezeichnung() {
        System.out.println("1 × 30-mm-Gatling-Maschinenkanone GAU-8/A Avenger ");
    }

    @Override
    public void munitionsart() {
        System.out.println("Vollmantel");
    }

    @Override
    public void kaliber() {
       System.out.println("50");
    }

    @Override
    public void anzahlMontiert() {
        System.out.println("3");
    }

    // Abwehrmassnahmen
    @Override
    public void abwehr() {
        System.out.println("Täuschkörper");
    }

    @Override
    public void anzahlMassnahmen() {
        System.out.println("30 Aktivierungen");
    }
}
