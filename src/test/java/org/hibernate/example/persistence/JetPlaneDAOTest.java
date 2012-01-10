package org.hibernate.example.persistence;

import org.hibernate.example.model.JetPlane;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static junit.framework.Assert.*;

public class JetPlaneDAOTest
    extends AbstractDAOTest
{
// ------------------------------ FIELDS ------------------------------

    @Autowired
    private JetPlaneDAO jetPlaneDAO;

// -------------------------- OTHER METHODS --------------------------

    @Test
    public void testJetPlanes()
        throws Exception
    {
        String name = "Jet Plane";

        JetPlane jetPlane = new JetPlane();
        jetPlane.setName( name );
        jetPlaneDAO.createJetPlane( jetPlane );

        List<JetPlane> planes = jetPlaneDAO.findJetPlanes();
        assertEquals( 1, planes.size() );
        assertEquals( name, planes.get( 0 ).getName() );
    }
}
