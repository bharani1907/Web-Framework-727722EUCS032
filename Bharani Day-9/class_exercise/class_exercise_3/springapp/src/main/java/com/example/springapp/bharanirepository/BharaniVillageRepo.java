package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.BharaniVillage;
import java.util.List;

@Repository
public interface BharaniVillageRepo extends JpaRepository<BharaniVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    BharaniVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    BharaniVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<BharaniVillage> findByPopulation(int population);

}
