package com.example.spring_prj1.com.persons;

import jakarta.persistence.*;

@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int personID;
    @Column(name = "Firstname")
    private String firstName;
    @Column(name = "Lastname")
    private String lastName;
    @Column(name = "City")
    private String city;

    protected Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
