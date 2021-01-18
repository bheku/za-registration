package net.iqb.zaregistration.persistence;

import net.iqb.zaregistration.model.jpa.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
