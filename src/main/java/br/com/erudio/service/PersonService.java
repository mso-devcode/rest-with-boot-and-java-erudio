package br.com.erudio.service;

import br.com.erudio.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private static final  AtomicLong COUNTER = new AtomicLong();

    private final Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("Finding one person");
        return mockePerson(id);
    }

    private Person mockePerson(String id) {

        Person person = new Person();

        person.setFirstName("FirstName " + id);
        person.setLastName("LastName " + id);
        person.setId(COUNTER.incrementAndGet());
        person.setGender("Sexo" + id);

        return person;
    }


    public List<Person> findByAll() {
        logger.info("Finding all people");

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 8; i++ ) {
            Person person = mockePerson(String.valueOf(i));
            persons.add(person);
        }
        return persons;
    }

    public Person save(Person person) {
       logger.info("save one person");
       return person;
    }

    public Person update(Person person) {
        logger.info("update one person");
        return person;

    }

    public void delete(String id) {
        logger.info("deleting one person");
    }
}
