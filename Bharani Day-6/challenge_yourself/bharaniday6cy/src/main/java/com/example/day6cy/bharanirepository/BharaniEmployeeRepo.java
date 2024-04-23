package com.example.day6cy.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6cy.bharanimodel.BharaniEmployee;

public interface BharaniEmployeeRepo extends JpaRepository<BharaniEmployee,Integer>{
    
}
