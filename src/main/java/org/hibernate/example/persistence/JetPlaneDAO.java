package org.hibernate.example.persistence;

import org.hibernate.example.model.JetPlane;

import java.util.List;

public interface JetPlaneDAO
{
// -------------------------- OTHER METHODS --------------------------

    void createJetPlane( JetPlane jetPlane );

    List<JetPlane> findJetPlanes();
}
