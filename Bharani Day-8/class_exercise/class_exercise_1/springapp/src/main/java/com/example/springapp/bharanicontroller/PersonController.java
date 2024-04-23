package com.example.springapp.bharanicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.bharanimodel.BharaniPerson;
import com.example.springapp.bharaniservice.BharaniPersonService;

@RestController
public class PersonController {
    @Autowired
    private BharaniPersonService ser;

    @PostMapping("/person")
    public ResponseEntity<BharaniPerson> post(@RequestBody BharaniPerson person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<BharaniPerson>> getAll(@PathVariable String value) {
        List<BharaniPerson> li = ser.start(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<BharaniPerson>> getbyAge(@PathVariable String value) {
        List<BharaniPerson> li = ser.end(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
