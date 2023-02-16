package objects;



public class Zuschauer extends Person {

    private Adresse adresse;
    private String ausweisNr;
    private Gewaltbereitschaft gewaltbereitschaft;


    public Zuschauer( String ausweisNr, String name,int alter, Adresse adresse, Gewaltbereitschaft gewaltbereitschaft) {
        super(name,alter);

        this.adresse = adresse;
        this.gewaltbereitschaft = gewaltbereitschaft;
        this.ausweisNr = ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Gewaltbereitschaft getGewaltbereitschaft() {
        return gewaltbereitschaft;
    }

    public void setGewaltbereitschaft(Gewaltbereitschaft gewaltbereitschaft) {
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }


    @Override
    public String toString() {
        return "objects.Zuschauer{" +
                "adresse=" + adresse +
                ", ausweisNr='" + ausweisNr + '\'' +
                ", gewaltbereitschaft=" + gewaltbereitschaft +
                '}';
    }
}
