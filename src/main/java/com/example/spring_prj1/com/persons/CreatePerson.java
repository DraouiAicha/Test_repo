package com.example.spring_prj1.com.persons;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CreatePerson {
    @PersistenceContext
    private EntityManager entityManager;

    public String createUser(String name, String lastName, String city) {
        Person person = new Person();
        person.setFirstName(name);
        person.setLastName(lastName);
        person.setCity(city);
        entityManager.persist(person);
        return person.toString();
    }

}
