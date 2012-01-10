package org.hibernate.example.persistence;

import org.hibernate.example.model.Boat;
import org.hibernate.example.model.SpeedBoat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static junit.framework.Assert.*;

public class BoatDAOTest
    extends AbstractDAOTest
{
// ------------------------------ FIELDS ------------------------------

    @Autowired
    private BoatDAO boatDAO;

// -------------------------- OTHER METHODS --------------------------

    @Test
    public void testBoats()
        throws Exception
    {
        String boatName = "boat";
        String speedBoatName = "speedBoat";

        Boat boat = new Boat();
        boat.setName( boatName );
        boatDAO.createBoat( boat );

        SpeedBoat speedBoat = new SpeedBoat();
        speedBoat.setName( speedBoatName );
        boatDAO.createBoat( speedBoat );

        List<Boat> boats = boatDAO.findBoats();
        assertEquals( 2, boats.size() );
        assertEquals( boatName, boats.get( 0 ).getName() );

        boats = boatDAO.findSpeedBoats();
        assertEquals( 1, boats.size() );
        assertTrue( boats.get( 0 ) instanceof SpeedBoat );
        assertEquals( speedBoatName, boats.get( 0 ).getName() );
    }
}
