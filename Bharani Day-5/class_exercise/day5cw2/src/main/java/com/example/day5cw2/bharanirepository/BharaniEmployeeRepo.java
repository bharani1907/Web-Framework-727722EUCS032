package com.example.day5cw2.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.bharanimodel.BharaniEmployee;


@Repository
public interface BharaniEmployeeRepo extends JpaRepository<BharaniEmployee,Integer>{
    
}
