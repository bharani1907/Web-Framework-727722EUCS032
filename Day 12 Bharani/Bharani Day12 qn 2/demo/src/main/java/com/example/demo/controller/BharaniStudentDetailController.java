package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BharaniStudentDetail;
import com.example.demo.service.BharaniStudentDetailService;

@RestController
public class BharaniStudentDetailController {
    @Autowired
    BharaniStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<BharaniStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody BharaniStudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
