package objects;

import Exeptions.ZuschauerBereitsVorhandenExeption;

import java.util.List;

public class test {
    public static void main(String[] args)   {
        Adresse a1 = new Adresse("Schuhstraße","1B","21211","Schuhstadt");
        Zuschauer z1 = new Zuschauer("1B22","Ali",18,a1,Gewaltbereitschaft.Friedlich);
        ZuschauerDAO zuschauerDAO = new ZuschauerDAO();
        List<Zuschauer> zuschauerList;

        System.out.println("--------------------------------");
        System.out.println("Leere Datenbank überprüfen");
        zuschauerList = zuschauerDAO.findAll();
        System.out.println("Anzahl:" + " " + zuschauerList.size());
        System.out.println("--------------------------------");
        System.out.println("Datensatz Hinzugefügt");
       try {
           zuschauerDAO.insert(z1);
           System.out.println("Hinzufügen Erfolgreich");
           System.out.println("Der Zuschauer " + " " + z1.getName() + " " + "mit der AusweisNr " + " " + z1.getAusweisNr() + " " +
            "Ist nun registriert");
           System.out.println("--------------------------------");
       }
       catch (ZuschauerBereitsVorhandenExeption e) {
           e.getMessage();
       }
        System.out.println("Erneute Kontrolle");
       zuschauerList = zuschauerDAO.findAll();
        System.out.println("Anzahl: " + zuschauerList.size());
        System.out.println("--------------------------------");
        System.out.println("Prüfe ob " + z1.getName() + " registriert ist");

    }
}
