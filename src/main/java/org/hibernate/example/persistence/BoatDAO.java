package org.hibernate.example.persistence;

import org.hibernate.example.model.Boat;
import org.hibernate.example.model.SpeedBoat;

import java.util.List;

public interface BoatDAO
{
// -------------------------- OTHER METHODS --------------------------

    void createBoat( Boat boat );

    List<Boat> findBoats();

    List<Boat> findSpeedBoats();
}
