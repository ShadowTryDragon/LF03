package objects;

import exeptions.GastNichtVorhandenException;
import exeptions.GastVorhandenExeption;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GastDao implements Dao {

    private Map<Integer, Gast> gastMap = new HashMap<>();


     // Fügt einen neuen Gast hinzu.
     // @param gast der hinzuzufügende neue Gast.
     // @throws exeptions. GastNichtVorhandenException Falls bereits ein Gast mit der GastNr vorhanden ist.

    public void insert(Gast gast) throws GastVorhandenExeption {
        if (gastMap.containsKey(gast.getGastNr())) {
            throw new GastVorhandenExeption(gast.getGastNr());
        }
        gastMap.put(gast.getGastNr(),gast);
    }

    /**
     * Ruft einen bestimmten Gast ab.
     * @param gastNr    Die GastNr des gewünschten Gastes.
     * @return  Der gewünschte Gast.
     * @throws GastNichtVorhandenException Falls kein Gast mit der gegebenen GastNr vorhanden ist.
     */
    public Gast findById(int gastNr) throws GastNichtVorhandenException {
        if (!gastMap.containsKey(gastNr)) {
            throw new GastNichtVorhandenException(gastNr);
        }
        return gastMap.get(gastNr);
    }

    /**
     * Ruft eine Liste aller Gäste ab.
     * @return  Die Liste aller Gäste.
     */
    public List<Gast> findAll() {
        return gastMap.values().stream().toList();
    }

    /**
     * Ändert die Daten eines bestehenden Gastes.
     * @param gast  Die neuen Daten des Gastes.
     * @throws GastNichtVorhandenException Falls kein Gast mit der gegebenen GastNr vorhanden ist.
     */
    public void update(Gast gast) throws GastNichtVorhandenException {
        if (!gastMap.containsKey(gast.getGastNr())) {
            throw new GastNichtVorhandenException(gast.getGastNr());
        }
        gastMap.replace(gast.getGastNr(), gast);
    }

    /**
     * Löscht einen Gast.
     * @param gastNr    Die GastNr des zu löschenden Gastes.
     * @throws exeptions.GastNichtVorhandenException  Falls kein Gast mit der gegebenen GastNr vorhanden ist.
     */
    public void delete(int gastNr) throws GastNichtVorhandenException {
        if (!gastMap.containsKey(gastNr)) {
            throw new GastNichtVorhandenException(gastNr);
        }
        gastMap.remove(gastNr);
    }

}
