package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.BharaniPerson;
import java.util.List;


@Repository
public interface BharaniPersonRepo extends JpaRepository<BharaniPerson,Integer>{

    List<BharaniPerson> findByLastnameNot(String lastname);
    List<BharaniPerson> findByAgeNotIn(List<Integer> ages);
    
}
