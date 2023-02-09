package exeptions;

public class LagerVorhandenExeption extends Exception{
    private String lagerID;

    public LagerVorhandenExeption(String lagerID) {
        this.lagerID = lagerID;
    }

    @Override
    public String getMessage() {

        return lagerID + " Existiert bereits und kann daher nicht Neu Angelegt werden";
    }
}
