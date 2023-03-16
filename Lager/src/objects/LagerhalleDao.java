package objects;

import exeptions.LagerVorhandenExeption;
import exeptions.LagerhalleNichtVorhandenExeption;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class LagerhalleDao implements Dao {

    private Map<String, Lagerhalle> lagerhalleMap = new HashMap<>();

    public void insert(Lagerhalle lagerhalle) throws LagerVorhandenExeption {
        if (lagerhalleMap.containsKey(lagerhalle.getLagerID()))
            throw new LagerVorhandenExeption(lagerhalle.getLagerID());
        lagerhalleMap.put(lagerhalle.getLagerID(), lagerhalle);
    }
    public Lagerhalle findById(String lagerID) throws LagerhalleNichtVorhandenExeption {
        if (!lagerhalleMap.containsKey(lagerID)) {
            throw new LagerhalleNichtVorhandenExeption(lagerID);
        }
        return lagerhalleMap.get(lagerID);
    }
    public List<Lagerhalle> findAll() {
        return lagerhalleMap.values().stream().collect(Collectors.toList()); }


    public void update(Lagerhalle lagerhalle) throws LagerhalleNichtVorhandenExeption {
        if (!lagerhalleMap.containsKey(lagerhalle.getLagerID())) {
            throw new LagerhalleNichtVorhandenExeption(lagerhalle.getLagerID());
        }
        lagerhalleMap.replace(lagerhalle.getLagerID(),lagerhalle);

    }
    public void delete(String lagerID) throws LagerhalleNichtVorhandenExeption {
        if (!lagerhalleMap.containsKey(lagerID)) {
            throw new LagerhalleNichtVorhandenExeption(lagerID);
        }
        lagerhalleMap.remove(lagerID);

    }


    }


