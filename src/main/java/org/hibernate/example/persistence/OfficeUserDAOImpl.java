package org.hibernate.example.persistence;

import org.hibernate.example.model.OfficeUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class OfficeUserDAOImpl
    implements OfficeUserDAO
{
// ------------------------------ FIELDS ------------------------------

    @PersistenceContext
    private EntityManager em;

// ------------------------ INTERFACE METHODS ------------------------

// --------------------- Interface OfficeUserDAO ---------------------

    public void createOfficeUser( OfficeUser officeUser )
    {
        em.persist( officeUser );
    }

    @SuppressWarnings("unchecked")
    public List<OfficeUser> findAllOfficeUsers()
    {
        Query query = em.createQuery( "from OfficeUser" );
        return query.getResultList();
    }
}
