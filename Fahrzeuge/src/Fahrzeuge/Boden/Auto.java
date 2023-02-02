package Fahrzeuge.Boden;
import Fahrzeuge.Fahrzeuge;

public class Auto extends Fahrzeuge {
    public Auto(String farbe) {
        super(farbe);
    }

    @Override
    public void fahren() {
        System.out.println("Brumm");

    }

    @Override
    public void bremsen() {
        System.out.println("BRRR");
    }

    @Override
    public void hupen() {
        System.out.println("Huuuup");
    }
}
