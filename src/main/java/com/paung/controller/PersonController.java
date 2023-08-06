package com.paung.controller;

import com.paung.entity.PersonEntity;
import com.paung.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person", method = RequestMethod.POST)
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonEntity> getAllUser(){
        List<PersonEntity> persons = personService.getAllUser();
        System.out.println("person : " + persons);
        return persons;
    }

    @GetMapping("/{personId}")
    public PersonEntity userById(@PathVariable Long personId){
        PersonEntity person = personService.getUserById(personId);
        System.out.println("person id : "+ personId + " person : "+ person);
        return person;
    }

    @PostMapping
    public String savePerson(@RequestBody PersonEntity person){
        personService.savePerson(person);
        return "person successfully saveed";
    }

    @PutMapping("/{personId}")
    public String updatePerson(@RequestBody PersonEntity person, @PathVariable Long personId){
        personService.updatePerson(person, personId);
        return "user successfully updated";
    }

    @DeleteMapping("/{personId}")
    public String deletePerson(@PathVariable Long personId){
        personService.deletePerson(personId);
        return "person succesfully deleted";
    }





}
