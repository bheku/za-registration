package net.iqb.zaregistration.mapper;

import net.iqb.zaregistration.model.jpa.Person;
import net.iqb.zaregistration.model.json.PersonDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDetailsToEntityTest {

    @Test
    void mappingsOk(){

        String name = "Test Name";
        String nationalID = "Test ID";
        String phoneNumber = "Test Number";

        Person person = PersonDetailsToEntity.map(new PersonDetails(name, nationalID, phoneNumber));

        assertTrue(name.equalsIgnoreCase(person.getName()));
        assertTrue(nationalID.equalsIgnoreCase(person.getNationalId()));
        assertTrue(phoneNumber.equalsIgnoreCase(person.getPhoneNumber()));
    }

}