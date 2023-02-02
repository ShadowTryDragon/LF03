package Fahrzeuge.Boden;

import Fahrzeuge.Fahrzeuge;

public class Laster extends Fahrzeuge {

    public Laster(String farbe) {
        super(farbe);
    }

    @Override
    public void fahren() {
        System.out.println("Wuiiiii");
    }

    @Override
    public void bremsen() {
        System.out.println("Quiiiiiitsch");
    }

    @Override
    public void hupen() {
        System.out.println("Tuuuuuuuuut");
    }

    public static class Auto extends Fahrzeuge {
        public Auto(String farbe) {
            super(farbe);
        }

        @Override
        public void fahren() {
            System.out.println("Brumm Brumm");

        }

        @Override
        public void bremsen() {
            System.out.println("rrrrrrr");
        }

        @Override
        public void hupen() {
            System.out.println("Huup");
        }
    }
}
