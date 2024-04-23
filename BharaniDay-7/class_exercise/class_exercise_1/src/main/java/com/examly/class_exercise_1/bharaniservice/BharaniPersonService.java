package com.examly.class_exercise_1.bharaniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.bharanimodel.BharaniPerson;
import com.examly.class_exercise_1.bharanirepository.BharaniPersonRepo;

@Service
public class BharaniPersonService {

     @Autowired
     public BharaniPersonRepo personRepo;

     public BharaniPerson SaveEntity(BharaniPerson entity) {
          return personRepo.save(entity);

     }

     public List<BharaniPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<BharaniPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
