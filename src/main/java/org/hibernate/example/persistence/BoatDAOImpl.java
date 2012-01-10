package org.hibernate.example.persistence;

import org.hibernate.example.model.Boat;
import org.hibernate.example.model.SpeedBoat;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BoatDAOImpl
    implements BoatDAO
{
// ------------------------------ FIELDS ------------------------------

    @PersistenceContext
    private EntityManager em;

// ------------------------ INTERFACE METHODS ------------------------

// --------------------- Interface BoatDAO ---------------------

    public void createBoat( Boat boat )
    {
        em.persist( boat );
    }

    @SuppressWarnings("unchecked")
    public List<Boat> findBoats()
    {
        Query query = em.createQuery( "from Boat " );
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Boat> findSpeedBoats()
    {
        Query query = em.createQuery( "from SpeedBoat " );
        return query.getResultList();
    }
}
