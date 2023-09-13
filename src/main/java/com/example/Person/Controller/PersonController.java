package com.example.Person.Controller;
import com.example.Person.Dao.Person;
import com.example.Person.Repository.PersonRepository;
import com.example.Person.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/{user_id}")
    public Person getPersonById(@PathVariable(value = "user_id") int user_id) {
        return personService.getPersonById(user_id);
    }

    @GetMapping("/all")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }


    @PostMapping()
    public Person createPerson(@RequestBody Person person){
        return personService.create(person);
    }

    @PutMapping("/{user_id}")
    public Person updatePerson(@PathVariable(value = "user_id") int user_id, @RequestBody Person person){
        return personService.updatePerson(user_id, person);

    }

    @GetMapping()
    public Person getPersonByName(String name){
        return personService.getPersonByName(name);
    }

    @DeleteMapping("/{user_id}")
    public String delete(@PathVariable(value = "user_id") int user_id) {
        personService.delete(user_id);
        return "Person deleted successfully";
    }
}
