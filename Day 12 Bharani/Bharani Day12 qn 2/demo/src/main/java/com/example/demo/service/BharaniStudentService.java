package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BharaniStudent;
import com.example.demo.repository.BharaniStudentRepository;

@Service
public class BharaniStudentService {
    @Autowired
    BharaniStudentRepository studentRepository;
    public BharaniStudent addStudents(BharaniStudent student)
    {
        return studentRepository.save(student);
    }
    public List<BharaniStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<BharaniStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<BharaniStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
