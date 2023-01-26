public class Tonne extends Behaelter {
    private double durchmesser;
    public Tonne(String behaelterNr, double gewichtBehaelter, double gewichtInhalt, double gewichtInhaltMax, double durchmesser) {
        super(behaelterNr, gewichtBehaelter, gewichtInhalt, gewichtInhaltMax);
        this.durchmesser = durchmesser;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        String text;
        text = super.toString();
        text = text + "\n\t" + "Durchmesser der Tonne: " + durchmesser;
        return text;
    }
}
