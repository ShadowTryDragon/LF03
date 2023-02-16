package objects;

import Exeptions.ZuschauerBereitsVorhandenExeption;
import Exeptions.ZuschauerNichtVorhandenExeption;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZuschauerDAO {
    Map<String,Zuschauer> zuschauerMap = new HashMap<>();


    public void insert(Zuschauer zuschauer) throws ZuschauerBereitsVorhandenExeption {
        if (zuschauerMap.containsKey(zuschauer.getAusweisNr())) {
            throw new  ZuschauerBereitsVorhandenExeption(zuschauer.getAusweisNr()); }

         zuschauerMap.put(zuschauer.getAusweisNr(), zuschauer);
    }
    public Zuschauer searchById(String ausweisNr) throws ZuschauerNichtVorhandenExeption {
        if (!zuschauerMap.containsKey(ausweisNr)) {
            throw new ZuschauerNichtVorhandenExeption(ausweisNr);
        }
        return zuschauerMap.get(ausweisNr);
    }
    public List<Zuschauer> findAll() {
        return zuschauerMap.values().stream().toList();
    }
    public void updateZuschauer(Zuschauer zuschauer) throws ZuschauerNichtVorhandenExeption {
        if (!zuschauerMap.containsKey(zuschauer.getAusweisNr())) {
            throw new ZuschauerNichtVorhandenExeption(zuschauer.getAusweisNr());
        }
        zuschauerMap.replace(zuschauer.getAusweisNr(), zuschauer);
    }
    public void deleteZuschauer(String ausweisNr) throws ZuschauerNichtVorhandenExeption {
        if (!zuschauerMap.containsKey(ausweisNr)) {
            throw new ZuschauerNichtVorhandenExeption(ausweisNr);
        }
        zuschauerMap.remove(ausweisNr);
    }
}
