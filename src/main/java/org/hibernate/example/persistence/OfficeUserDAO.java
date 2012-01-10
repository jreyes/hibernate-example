package org.hibernate.example.persistence;

import org.hibernate.example.model.OfficeUser;

import java.util.List;

public interface OfficeUserDAO
{
// -------------------------- OTHER METHODS --------------------------

    void createOfficeUser( OfficeUser officeUser );

    List<OfficeUser> findAllOfficeUsers();
}
