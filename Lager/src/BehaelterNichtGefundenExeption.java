public class BehaelterNichtGefundenExeption extends Exception {
    private String behaelterNr;
    public BehaelterNichtGefundenExeption(String behaelterNr){
        this.behaelterNr = behaelterNr;

    }

    @Override
    public String getMessage() {
        return behaelterNr + "Kann nicht Gefunden werden";
    }
}
