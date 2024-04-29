package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BharaniAddress;
import com.example.demo.service.BharaniAddressService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BharaniAddressController {
    
    @Autowired
    BharaniAddressService addressService;

    @SuppressWarnings("null")
    @PostMapping("/address/employee/{id}")
    public ResponseEntity<BharaniAddress> postMethodName(@RequestBody BharaniAddress address,@PathVariable int id) {
        
        try{
            return new ResponseEntity<>(addressService.setAddressById(id, address),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
