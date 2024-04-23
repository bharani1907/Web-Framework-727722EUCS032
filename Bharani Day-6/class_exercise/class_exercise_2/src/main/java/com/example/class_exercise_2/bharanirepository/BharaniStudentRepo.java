package com.example.class_exercise_2.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.bharanimodel.BharaniStudent;

@Repository
public interface BharaniStudentRepo extends JpaRepository<BharaniStudent, Integer> {

}