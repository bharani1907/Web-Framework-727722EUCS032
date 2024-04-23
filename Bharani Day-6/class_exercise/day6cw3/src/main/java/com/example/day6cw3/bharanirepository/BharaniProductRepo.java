package com.example.day6cw3.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.bharanimodel.BharaniProduct;

@Repository
public interface BharaniProductRepo extends JpaRepository<BharaniProduct,Integer>{
    
}
