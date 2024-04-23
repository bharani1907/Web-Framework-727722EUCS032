package com.examly.class_exercise_1.bharanicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.bharanimodel.BharaniPerson;
import com.examly.class_exercise_1.bharaniservice.BharaniPersonService;

@RestController
public class BharaniPersonController {

     @Autowired
     public BharaniPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<BharaniPerson> postMethodName(@RequestBody BharaniPerson entity) {

          BharaniPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<BharaniPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<BharaniPerson>> getMethodName() {

          List<BharaniPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<BharaniPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<BharaniPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<BharaniPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}