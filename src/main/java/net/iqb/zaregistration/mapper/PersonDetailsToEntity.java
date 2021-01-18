package net.iqb.zaregistration.mapper;

import net.iqb.zaregistration.model.jpa.Person;
import net.iqb.zaregistration.model.json.PersonDetails;

public class PersonDetailsToEntity {

    public static Person map(PersonDetails details){

        Person person = new Person();

        person.setName(details.getName());
        person.setNationalId(details.getNationalID());
        person.setPhoneNumber(details.getPhoneNumber());

        return person;
    }
}
