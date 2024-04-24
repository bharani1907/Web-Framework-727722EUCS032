package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.BharaniUser;
import com.example.springapp.service.BharaniUserService;

@RestController
@RequestMapping("/api")
public class BharaniUserController {
    
    @Autowired
    private BharaniUserService userService;

    @PostMapping("/user")
    public ResponseEntity<BharaniUser> post(@RequestBody BharaniUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<BharaniUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<BharaniUser> getById(@PathVariable int userId)
    {
        BharaniUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<BharaniUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<BharaniUser> getByUserName(@PathVariable String userName)
    {
        BharaniUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<BharaniUser>(user, HttpStatus.OK);
        }
    }
}
