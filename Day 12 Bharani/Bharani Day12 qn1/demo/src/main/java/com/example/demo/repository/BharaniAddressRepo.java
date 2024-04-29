package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BharaniAddress;

import jakarta.transaction.Transactional;
@Repository
public interface BharaniAddressRepo extends JpaRepository<BharaniAddress,Integer>{

    @Modifying
    @Transactional
    @Query(value="insert into address(city,street,employee_id) values(?1,?2,?3)",nativeQuery = true)
    void setByemployeeId(String city,String street,int id);
     
}
