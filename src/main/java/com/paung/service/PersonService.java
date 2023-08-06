package com.paung.service;

import com.paung.entity.PersonEntity;

import java.util.List;

public interface PersonService {

    List<PersonEntity> getAllUser();
    PersonEntity getUserById(Long personId);
    void savePerson(PersonEntity person);
    void updatePerson(PersonEntity user, Long personId);
    void deletePerson(Long personId);
}
