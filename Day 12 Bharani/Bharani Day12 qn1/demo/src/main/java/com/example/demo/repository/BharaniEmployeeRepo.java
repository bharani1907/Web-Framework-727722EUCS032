package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.BharaniEmployee;

public interface BharaniEmployeeRepo extends JpaRepository<BharaniEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<BharaniEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<BharaniEmployee> getByLeftOuterEmployees();
}