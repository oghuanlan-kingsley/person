package com.example.Person.Service;

import com.example.Person.Controller.AddResponse;
import com.example.Person.Dao.Person;
import com.example.Person.Repository.PersonNotFoundException;
import com.example.Person.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;


    public List<Person> getAllPerson() {
       return personRepository.findAll();
    }

    public Person getPersonById(int user_id){
       return personRepository.findById(user_id)
               .orElseThrow(() -> new PersonNotFoundException(user_id));
    }

    public Person getPersonByName(String name) {
        return personRepository.findByName(name)
                .orElseThrow(() -> new PersonNotFoundException("Person not found with name: " + name));
    }

    public Person create(Person person){
        return personRepository.save(person);
    }

    public Person updatePerson(int user_id, Person person) {
        Person existingPerson = personRepository.findById(user_id)
                .orElseThrow(() -> new PersonNotFoundException(user_id));
            existingPerson.setName(person.getName());
            return personRepository.save(existingPerson);
    }

    public void delete(int user_id) {
        if (!personRepository.existsById(user_id)) {
            throw new PersonNotFoundException(user_id);
        }

        personRepository.deleteById(user_id);
    }


//    public static  int getMaxId(){
//        int max=0;
//        for(int id:personIdMap.keySet())
//            if (max<=id)
//                max=id;
//        return max+1;
//    }

}
