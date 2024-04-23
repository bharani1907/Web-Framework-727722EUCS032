package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.BharaniPerson;
import com.example.springapp.repository.BharaniPersonRepo;

@Service
public class BharaniPersonService {
    @Autowired
    private BharaniPersonRepo rep;

    public boolean post(BharaniPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<BharaniPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<BharaniPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
