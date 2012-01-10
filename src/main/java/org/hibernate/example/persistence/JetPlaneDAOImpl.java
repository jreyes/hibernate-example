package org.hibernate.example.persistence;

import org.hibernate.example.model.JetPlane;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JetPlaneDAOImpl
    implements JetPlaneDAO
{
// ------------------------------ FIELDS ------------------------------

    @PersistenceContext
    private EntityManager em;

// ------------------------ INTERFACE METHODS ------------------------

// --------------------- Interface JetPlaneDAO ---------------------

    public void createJetPlane( JetPlane jetPlane )
    {
        em.persist( jetPlane );
    }

    @SuppressWarnings("unchecked")
    public List<JetPlane> findJetPlanes()
    {
        Query query = em.createQuery( "from JetPlane" );
        return query.getResultList();
    }
}
