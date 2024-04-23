package com.example.day5cw3.bharaniservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.bharanimodel.BharaniLanguage;
import com.example.day5cw3.bharanirepository.BharaniLanguageRepo;

@Service
public class BharaniLanguageService {
    private BharaniLanguageRepo languageRepo;
    public BharaniLanguageService(BharaniLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(BharaniLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<BharaniLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,BharaniLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public BharaniLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
