package com.example.class_exercise_2.bharaniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.bharanimodel.BharaniStudent;
import com.example.class_exercise_2.bharanirepository.BharaniStudentRepo;

@Service
public class BharaniStudentService {

     @Autowired
     public BharaniStudentRepo studentRepo;

     public List<BharaniStudent> getAll() {
          return studentRepo.findAll();
     }

     public BharaniStudent post(BharaniStudent student) {
          return studentRepo.save(student);
     }

     public List<BharaniStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
