package com.examly.springapp.bharaniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.bharanimodel.BharaniStudent;
import com.examly.springapp.bharanirepository.BharaniStudentRepo;

@Service
public class BharaniStudentService {
    @Autowired
    private BharaniStudentRepo studentRepo;

    public boolean post(BharaniStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<BharaniStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<BharaniStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
