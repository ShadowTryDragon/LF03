package Fahrzeuge.Boden;

import Fahrzeuge.Fahrzeuge;

public class Laster implements Fahrzeuge {
    @Override
    public void farbe() {

    }

    @Override
    public void Marke() {
        System.out.println("Mercedes");
    }

    @Override
    public void Model() {
        System.out.println("Actros");
    }
}