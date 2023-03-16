package objects;

import exeptions.GastNichtVorhandenException;
import exeptions.GastVorhandenExeption;

import java.util.List;

public interface Dao {

    void insert(Gast gast) throws GastVorhandenExeption;
    Gast findById(int gastNr) throws GastNichtVorhandenException;
    List<Gast> findAll();
     void update(Gast gast) throws GastNichtVorhandenException;
     void delete(int gastNr) throws GastNichtVorhandenException;




}
