package net.iqb.zaregistration.service;

import net.iqb.zaregistration.mapper.PersonDetailsToEntity;
import net.iqb.zaregistration.model.jpa.Person;
import net.iqb.zaregistration.model.json.PersonDetails;
import net.iqb.zaregistration.persistence.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class RegistrationService {

    private final PersonRepository repository;

    @Autowired
    public RegistrationService(PersonRepository repository) {
        this.repository = repository;
    }

    public void add(PersonDetails details){
        repository.save(PersonDetailsToEntity.map(details));
    }

    // For demonstration purposes only. Not intend for large result sets.
    public List<PersonDetails> getReport() {

        List<PersonDetails> people = new ArrayList<>();
        final Iterable<Person> resultList = repository.findAll();
        final Iterator<Person> iterator = resultList.iterator();

        while(iterator.hasNext()){
            Person person = iterator.next();
            people.add(new PersonDetails(person.getName(), person.getNationalId(), person.getPhoneNumber()));
        }

        return people;
    }
}
