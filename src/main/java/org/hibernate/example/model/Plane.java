package org.hibernate.example.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class Plane
    implements Serializable
{
// ------------------------------ FIELDS ------------------------------

    private Long id;

    private String name;

// --------------------- GETTER / SETTER METHODS ---------------------

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    @Column(name = "PLANE_NAME")
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
