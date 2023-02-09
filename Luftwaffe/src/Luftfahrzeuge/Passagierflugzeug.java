package Luftfahrzeuge;

public class Passagierflugzeug implements Fluggeraete {

    @Override
    public void bezeichnung() {
        System.out.println("Bojing 707");

    }

    @Override
    public void kennung() {
        System.out.println("B0707-A100");
    }

    @Override
    public void Typ() {
        System.out.println("Zivil");

    }
}
