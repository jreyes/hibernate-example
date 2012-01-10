package org.hibernate.example.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "H_OFFICE_USER")
@PrimaryKeyJoinColumn(name = "USER_ID")
public class OfficeUser
    extends User
{
// ------------------------------ FIELDS ------------------------------

    private String office;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getOffice()
    {
        return office;
    }

    public void setOffice( String office )
    {
        this.office = office;
    }
}
