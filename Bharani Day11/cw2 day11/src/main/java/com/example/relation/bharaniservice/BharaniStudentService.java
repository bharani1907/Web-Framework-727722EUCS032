package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.Student;
import com.example.relation.repository.StudentRepository;

@Service
public class BharaniStudentService {
    public StudentRepository studentRepository;
    public BharaniStudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
