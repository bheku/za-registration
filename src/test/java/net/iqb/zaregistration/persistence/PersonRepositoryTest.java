package net.iqb.zaregistration.persistence;

import net.iqb.zaregistration.mapper.PersonDetailsToEntity;
import net.iqb.zaregistration.model.jpa.Person;
import net.iqb.zaregistration.model.json.PersonDetails;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    PersonRepository repository;

    @Test
    public void saveImplementationOK(){

        PersonDetails details = new PersonDetails("J Doe","78362628272", "009988a9a");
        repository.save(PersonDetailsToEntity.map(details));

        final Iterable<Person> all = repository.findAll();

        assertTrue(all.iterator().hasNext());
    }
}
