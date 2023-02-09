package Luftfahrzeuge;

public class NachrichtenHeli implements Fluggeraete {

    @Override
    public void bezeichnung() {
        System.out.println("MBB/ Eurocopter BO 105");

    }

    @Override
    public void kennung() {
        System.out.println("BO105-N");
    }

    @Override
    public void Typ() {
        System.out.println("Zivil");
    }
}
