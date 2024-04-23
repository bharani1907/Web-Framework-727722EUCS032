package com.example.day5cw2.bharaniservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.bharanimodel.BharaniEmployee;
import com.example.day5cw2.bharanirepository.BharaniEmployeeRepo;

@Service
public class BharaniEmployeeService {
    public BharaniEmployeeRepo employeeRepo;
    public BharaniEmployeeService(BharaniEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(BharaniEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,BharaniEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public BharaniEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
