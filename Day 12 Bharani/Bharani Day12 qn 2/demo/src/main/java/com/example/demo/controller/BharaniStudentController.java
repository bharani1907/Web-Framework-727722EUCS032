package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BharaniStudent;
import com.example.demo.service.BharaniStudentService;


@RestController
public class BharaniStudentController{
    @Autowired
    BharaniStudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<BharaniStudent> addStudents(@RequestBody BharaniStudent student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<BharaniStudent>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<BharaniStudent>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


