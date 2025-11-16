package br.com.erudio.controller;

import br.com.erudio.model.Person;
import br.com.erudio.service.PersonService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/{id}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
        )
    public Person findById(@PathVariable String id) {
        return this.personService.findById(id);
    }

    @RequestMapping( method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findByAll() {
        return this.personService.findByAll();
    }

    @RequestMapping( method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Person save(@RequestBody Person person) {
        return this.personService.save(person);
    }

    @RequestMapping( method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person) {
        return this.personService.update(person);
    }

    @RequestMapping( value = "/{id}" ,
            method = RequestMethod.DELETE
    )    public ResponseEntity<Void> delete(@PathVariable String id) {
        this.personService.delete(id);
        return ResponseEntity.noContent().build();

    }


}
