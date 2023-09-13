package com.example.Person.Repository;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(int user_id) {
        super("Person not found with ID: " + user_id);
    }

    public PersonNotFoundException(String name) {
        super("Person not found with ID: " + name);
    }
}
