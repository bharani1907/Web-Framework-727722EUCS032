package com.example.springapp.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.bharanimodel.BharaniPerson;
import java.util.List;


@Repository
public interface BharaniPersonRepo extends JpaRepository<BharaniPerson,Integer>{

    List<BharaniPerson> findByNameStartingWith(String name);
    List<BharaniPerson> findByNameEndingWith(String name);
    
}
