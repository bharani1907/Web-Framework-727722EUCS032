package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BharaniEmployee;
import com.example.demo.repository.BharaniEmployeeRepo;

@Service
public class BharaniEmployeeService {
    @Autowired
    BharaniEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public BharaniEmployee setEmployee(BharaniEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<BharaniEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<BharaniEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
