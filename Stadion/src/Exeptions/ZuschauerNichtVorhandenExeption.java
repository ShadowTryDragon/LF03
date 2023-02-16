package Exeptions;

public class ZuschauerNichtVorhandenExeption extends Exception{
    private String ausweisNr;

    public String getZuschauerNr() {
        return ausweisNr;
    }
    public ZuschauerNichtVorhandenExeption(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String getMessage() {
        System.out.println(" Der Zuschauer mit der ID " + " " +  ausweisNr + "Ist nicht vorhanden");
        return super.getMessage();
    }
}