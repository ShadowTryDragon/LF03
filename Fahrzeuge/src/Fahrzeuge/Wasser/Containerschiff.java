package Fahrzeuge.Wasser;

public class Containerschiff extends Wasserfahrzeuge {
    private int plaetzeContainer;
    private String genaueBezeichnung;
    private double maxGewicht;

    public Containerschiff(double tiefgang, int plaetzeContainer, String genaueBezeichnung, double maxGewicht) {
        super(tiefgang);
        this.plaetzeContainer = plaetzeContainer;
        this.genaueBezeichnung = genaueBezeichnung;
        this.maxGewicht = maxGewicht;
    }

    @Override
    public void tuckern() {
        System.out.println("Schön Langsam");
    }

    public int getPlaetzeContainer() {
        return plaetzeContainer;
    }

    public void setPlaetzeContainer(int plaetzeContainer) {
        this.plaetzeContainer = plaetzeContainer;
    }

    public String getGenaueBezeichnung() {
        return genaueBezeichnung;
    }

    public void setGenaueBezeichnung(String genaueBezeichnung) {
        this.genaueBezeichnung = genaueBezeichnung;
    }

    public double getMaxGewicht() {
        return maxGewicht;
    }

    public void setMaxGewicht(double maxGewicht) {
        this.maxGewicht = maxGewicht;
    }
}
