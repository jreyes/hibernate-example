package org.hibernate.example.persistence;

import org.hibernate.example.model.OfficeUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static junit.framework.Assert.*;

public class OfficeUserDAOTest
    extends AbstractDAOTest
{
// ------------------------------ FIELDS ------------------------------

    @Autowired
    private OfficeUserDAO officeUserDAO;

// -------------------------- OTHER METHODS --------------------------

    @Test
    public void testOfficeUser()
        throws Exception
    {
        String name = "Some name";
        String office = "Some office";

        OfficeUser user = new OfficeUser();
        user.setName( name );
        user.setOffice( office );
        officeUserDAO.createOfficeUser( user );

        List<OfficeUser> users = officeUserDAO.findAllOfficeUsers();
        assertFalse( users.isEmpty() );
        assertEquals( 1, users.size() );
        assertEquals( name, users.get( 0 ).getName() );
        assertEquals( office, users.get( 0 ).getOffice() );
    }
}
