package com.example.springapp.bharanirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.bharanimodel.BharaniPerson;

public interface BharaniPersonRepo extends JpaRepository<BharaniPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<BharaniPerson> findByAge(int age);
}
