package com.demos.CRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demos.CRUD.entities.Person;
import com.demos.CRUD.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        // code to get all persons from database
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        // code to get person by id from database
        return personRepository.findById(id).orElse(null);
    }

    public Person savePerson(Person person) {
        // code to save person in database
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public Person updatePerson(long id, Person personDetails) {
        // code to update person in database
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(personDetails.getName());
        person.setAge(personDetails.getAge());
        return personRepository.save(person);
    }

}
