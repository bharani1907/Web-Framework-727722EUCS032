package com.example.day5cw1.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.bharanimodel.BharaniProduct;

@Repository
public interface BharaniProductRepo extends JpaRepository<BharaniProduct,Integer>{
    
}
