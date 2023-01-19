public class Gast extends Person {
    Adresse adresse;
  public Gast(String vorname, String nachname, Adresse adresse) {
      super(vorname, nachname);
      this.adresse = adresse;
  }
}
