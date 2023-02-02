package Fahrzeuge;

public abstract class Fahrzeuge {
    private String farbe;

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Fahrzeuge(String farbe) {
        this.farbe = farbe;
    }
    public abstract void fahren();
    public abstract void bremsen();
    public abstract void hupen();
}
