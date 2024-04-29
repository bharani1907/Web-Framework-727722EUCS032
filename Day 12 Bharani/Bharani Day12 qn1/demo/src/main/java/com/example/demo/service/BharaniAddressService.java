package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BharaniAddress;
import com.example.demo.repository.BharaniAddressRepo;
import com.example.demo.repository.BharaniEmployeeRepo;

@Service
public class BharaniAddressService {
    @Autowired
    BharaniAddressRepo addressRepo;
    @Autowired
    BharaniEmployeeRepo employeeRepo;
    public BharaniAddress setAddressById(int id,BharaniAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
