package org.hibernate.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SpeedBoat")
public class SpeedBoat
    extends Boat
{
}
