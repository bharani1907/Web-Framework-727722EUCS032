package com.examly.class_exercise_1.bharanirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.bharanimodel.BharaniPerson;

/**
 * PersonRepo
 */
@Repository
public interface BharaniPersonRepo extends JpaRepository<BharaniPerson, Integer> {

     List<BharaniPerson> findByAge(int byAge);
}