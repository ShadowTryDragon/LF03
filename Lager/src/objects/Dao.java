package objects;

import exeptions.LagerVorhandenExeption;
import exeptions.LagerhalleNichtVorhandenExeption;

import java.util.List;

public interface Dao {

     void insert(Lagerhalle lagerhalle) throws LagerVorhandenExeption;
     Lagerhalle findById(String lagerID) throws LagerhalleNichtVorhandenExeption;
     List<Lagerhalle> findAll();
     void update(Lagerhalle lagerhalle) throws LagerhalleNichtVorhandenExeption;
     void delete(String lagerID) throws LagerhalleNichtVorhandenExeption;

}
