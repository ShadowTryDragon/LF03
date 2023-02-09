package Fahrzeuge.Luft;



import waffen.Bomben;
import waffen.Geschuetz;

public class Kampfjet implements Fluggeraete, Bomben, Geschuetz {



    @Override
    public void fliegen() {

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

    }

    @Override
    public void anzahlMontiert() {

    }
}
