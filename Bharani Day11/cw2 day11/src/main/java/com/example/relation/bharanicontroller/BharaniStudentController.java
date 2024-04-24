package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.BharaniStudent;
import com.example.relation.service.BharaniStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class BharaniStudentController {
    public BharaniStudentService studentService;
    public BharaniStudentController(BharaniStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public BharaniStudent postMethodName(@RequestBody BharaniStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<BharaniStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
