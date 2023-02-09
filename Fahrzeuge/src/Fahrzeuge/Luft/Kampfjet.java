package Fahrzeuge.Luft;



import waffen.Bomben;
import waffen.Geschuetz;

public class Kampfjet implements Fluggeraete, Bomben, Geschuetz {


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

    @Override
    public void bombenart() {
        System.out.println("Streu");
    }

    @Override
    public void anzahlbomben() {
        System.out.println("50");
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
}
