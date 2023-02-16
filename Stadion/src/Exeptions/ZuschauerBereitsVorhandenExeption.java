package Exeptions;

public class ZuschauerBereitsVorhandenExeption extends Exception{
    private String ausweisNr ;

    public String getZuschauerNr() {
        return ausweisNr;
    }
    public ZuschauerBereitsVorhandenExeption(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String getMessage() {
        System.out.println(" Der Zuschauer mit der ID " + " " +  ausweisNr + "Ist bereits vorhanden");
        return super.getMessage();
    }
}
