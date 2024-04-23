package com.example.class_exercise_2.bharanicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.bharanimodel.BharaniStudent;
import com.example.class_exercise_2.bharaniservice.BharaniStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BharaniStudentController {

     @Autowired
     public BharaniStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<BharaniStudent>> getDetails() {
          List<BharaniStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<BharaniStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<BharaniStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<BharaniStudent> postMethodName(@RequestBody BharaniStudent student) {

          BharaniStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<BharaniStudent>> sortedDetails(@PathVariable String field) {
          List<BharaniStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<BharaniStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<BharaniStudent>>(list, HttpStatus.OK);

     }
}
