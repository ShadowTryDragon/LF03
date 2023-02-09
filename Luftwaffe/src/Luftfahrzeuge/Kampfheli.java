package Luftfahrzeuge;

import Waffen.Abwehrmassnahmen;
import Waffen.Bomben;
import Waffen.Geschuetz;

public class Kampfheli implements Fluggeraete, Abwehrmassnahmen, Bomben, Geschuetz {
    @Override
    public void bezeichnung() {
        System.out.println("Apachi");
    }

    @Override
    public void kennung() {
        System.out.println("X3S1");
    }

    @Override
    public void Typ() {
        System.out.println("Militär");
    }

    @Override
    public void abwehr() {
        System.out.println("ECM Systems");
    }

    @Override
    public void anzahlMassnahmen() {
        System.out.println("50 Aktiviereungen");
    }

    @Override
    public void bombenart() {
        System.out.println("Gas");
    }

    @Override
    public void anzahlbomben() {
        System.out.println("10");
    }

    @Override
    public void waffenbezeichnung() {
        System.out.println("FLAK Geschütz");
    }

    @Override
    public void munitionsart() {
        System.out.println("Panzerbrechend");
    }

    @Override
    public void kaliber() {
        System.out.println("50");
    }

    @Override
    public void anzahlMontiert() {
        System.out.println("1");
    }
}
