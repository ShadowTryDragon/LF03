public abstract class Behaelter {
    private String behaelterNr;
    private double gewichtBehaelter;
    private double gewichtInhaltMax;
    private double gewichtInhalt;
    public Behaelter( String behaelterNr, double gewichtBehaelter, double gewichtInhalt, double gewichtInhaltMax) {
        this.behaelterNr = behaelterNr;
        this.gewichtBehaelter = gewichtBehaelter;
        this.gewichtInhalt = gewichtInhalt;
        this.gewichtInhaltMax = gewichtInhaltMax;

    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public void setBehaelterNr(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    public double getGewichtBehaelter() {
        return gewichtBehaelter;
    }

    public void setGewichtBehaelter(double gewichtBehaelter) {
        this.gewichtBehaelter = gewichtBehaelter;
    }

    public double getGewichtInhaltMax() {
        return gewichtInhaltMax;
    }

    public double getGewichtInhalt() {
        return gewichtInhalt;
    }

    public void setGewichtInhaltMax(double gewichtInhaltMax) {
        this.gewichtInhaltMax = gewichtInhaltMax;
    }

    @Override
    public String toString() {
        String text;
         text = "BehälterNr: " + behaelterNr;
         text = text +  "\n\t" + "Behältergewicht: " + gewichtBehaelter;
         text = text +  "\n\t" + "gewicht des Inhalts: " + gewichtInhalt;
         text = text + "\n\t" + "Maximales Gewicht: " + gewichtInhaltMax;
        return text;
    }
}
