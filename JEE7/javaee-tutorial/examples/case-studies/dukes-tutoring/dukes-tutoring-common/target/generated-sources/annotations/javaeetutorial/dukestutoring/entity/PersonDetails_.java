package javaeetutorial.dukestutoring.entity;

import java.util.Date;
import javaeetutorial.dukestutoring.entity.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-07-03T22:14:00")
@StaticMetamodel(PersonDetails.class)
public class PersonDetails_ { 

    public static volatile SingularAttribute<PersonDetails, Long> id;
    public static volatile SingularAttribute<PersonDetails, Date> birthday;
    public static volatile SingularAttribute<PersonDetails, Person> person;
    public static volatile SingularAttribute<PersonDetails, byte[]> photo;

}