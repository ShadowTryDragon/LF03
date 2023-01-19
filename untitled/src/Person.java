public abstract class Person {
    private String vorname;
    public String nachname;

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
}
