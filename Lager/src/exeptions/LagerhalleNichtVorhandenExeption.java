package exeptions;

public class LagerhalleNichtVorhandenExeption extends Exception {
    private String lagerID;

    public LagerhalleNichtVorhandenExeption(String lagerID) {
        this.lagerID = lagerID;
    }

    @Override
    public String getMessage() {
        return "Lagerhalle" + lagerID +  " ist nicht vorhanden vielleicht hast du dich ja nur vertippt";
    }
}
