package com.paung.service.impl;

import com.paung.entity.PersonEntity;
import com.paung.repository.PersonRepository;
import com.paung.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<PersonEntity> getAllUser() {
        return personRepository.findAll();
    }

    @Override
    public PersonEntity getUserById(Long personId) {
        Optional<PersonEntity> userOpt = personRepository.findById(personId);
        if(userOpt.isPresent())
            return userOpt.get();
        else
            throw new RuntimeException("user not found.");
    }

    @Override
    public void savePerson(PersonEntity person) {
        PersonEntity personDetail = personRepository.save(person);
        System.out.println("user saved to db with user id : " + personDetail.getId());
    }

    @Override
    public void updatePerson(PersonEntity user, Long personId) {

    }

    @Override
    public void deletePerson(Long personId) {
        Optional<PersonEntity> personOpt = personRepository.findById(personId);
        if(personOpt.isPresent())
            personRepository.deleteById(personId);
        else
            throw new RuntimeException("user not found!");
    }
}
