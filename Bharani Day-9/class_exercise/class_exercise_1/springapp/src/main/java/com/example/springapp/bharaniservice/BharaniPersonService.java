package com.example.springapp.bharaniservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.bharanimodel.BharaniPerson;
import com.example.springapp.bharanirepository.BharaniPersonRepo;

@Service
public class BharaniPersonService {
    public BharaniPersonRepo personRepo;

    public BharaniPersonService(BharaniPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(BharaniPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<BharaniPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
