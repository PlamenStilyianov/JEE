package javaeetutorial.dukestutoring.entity;

import javaeetutorial.dukestutoring.entity.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-07-03T22:14:00")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, Long> id;
    public static volatile SingularAttribute<Address, String> street2;
    public static volatile SingularAttribute<Address, String> street1;
    public static volatile SingularAttribute<Address, Boolean> isPrimary;
    public static volatile SingularAttribute<Address, Person> person;
    public static volatile SingularAttribute<Address, String> postalCode;
    public static volatile SingularAttribute<Address, String> province;
    public static volatile SingularAttribute<Address, Boolean> active;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> country;

}