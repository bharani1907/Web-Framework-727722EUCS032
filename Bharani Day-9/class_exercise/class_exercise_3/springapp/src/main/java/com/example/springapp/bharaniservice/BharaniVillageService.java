package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.BharaniVillage;
import com.example.springapp.repository.BharaniVillageRepo;

@Service
public class BharaniVillageService {
    @Autowired
    private BharaniVillageRepo rep;

    public boolean post(BharaniVillage person)
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

    public BharaniVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public BharaniVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<BharaniVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
