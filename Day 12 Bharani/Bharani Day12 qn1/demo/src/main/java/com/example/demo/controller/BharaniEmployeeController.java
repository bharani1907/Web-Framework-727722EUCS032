package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BharaniEmployee;
import com.example.demo.service.BharaniEmployeeService;

@RestController
public class BharaniEmployeeController {
    @Autowired
    BharaniEmployeeService employeeService;

    @PostMapping("/employee")
    public BharaniEmployee setMethod(@RequestBody BharaniEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<BharaniEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<BharaniEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
