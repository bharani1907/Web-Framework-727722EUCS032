package com.example.day4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.Model.StudentModel;

public interface StudentRepository extends JpaRepository <StudentModel, Integer>{

}
