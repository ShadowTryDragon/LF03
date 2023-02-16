package objects;



public class Block {
    private String name;
    private Sitzplatz[][] sitzplaetze;


    public Block(String name, int anzahlReihen, int anzahlSitze) {
        this.name = name;
       this.sitzplaetze = new Sitzplatz [anzahlReihen][anzahlSitze];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
