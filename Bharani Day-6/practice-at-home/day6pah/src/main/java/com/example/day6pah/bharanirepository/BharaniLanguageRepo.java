package com.example.day6pah.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6pah.bharanimodel.BharaniLanguage;

@Repository
public interface BharaniLanguageRepo extends JpaRepository<BharaniLanguage,Integer>{
    
}
