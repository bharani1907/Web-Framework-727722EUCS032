package com.example.springapp.bharaniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.bharanimodel.BharaniPerson;
import com.example.springapp.bharanirepository.BharaniPersonRepo;

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

    public List<BharaniPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<BharaniPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
