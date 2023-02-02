package Fahrzeuge.Wasser;

public abstract class Wasserfahrzeuge {
    private double tiefgang;
    public Wasserfahrzeuge(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }
    public abstract void tuckern();

}
