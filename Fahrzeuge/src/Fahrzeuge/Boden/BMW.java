package Fahrzeuge.Boden;
import Fahrzeuge.Fahrzeuge;

public class BMW implements Fahrzeuge {
    @Override
    public void farbe() {
        System.out.println("Rot");
    }

    @Override
    public void Marke() {
        System.out.println("BMW");
    }

    @Override
    public void Model() {
        System.out.println("M8 Competition");
    }
}