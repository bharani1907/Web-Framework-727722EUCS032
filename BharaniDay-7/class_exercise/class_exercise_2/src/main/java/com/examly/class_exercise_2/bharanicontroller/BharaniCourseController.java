package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.BharaniCourse;
import com.examly.class_exercise_2.service.BharaniCourseService;

@RestController
public class BharaniCourseController {

     @Autowired
     public BharaniCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<BharaniCourse> postMethodName(@RequestBody BharaniCourse entity) {

          BharaniCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<BharaniCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<BharaniCourse>> getMethodName() {

          List<BharaniCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<BharaniCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<BharaniCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<BharaniCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}