package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BharaniAuthor;
@Repository
public interface BharaniAuthorRepository extends JpaRepository<BharaniAuthor, Long> {
}
