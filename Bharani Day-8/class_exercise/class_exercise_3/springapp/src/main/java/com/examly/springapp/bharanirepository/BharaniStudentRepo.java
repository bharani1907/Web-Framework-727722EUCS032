package com.examly.springapp.bharanirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.bharanimodel.BharaniStudent;

import java.util.List;

@Repository
public interface BharaniStudentRepo extends JpaRepository<BharaniStudent, Long> {

    List<BharaniStudent> findByMarksGreaterThan(int mark);

    List<BharaniStudent> findByMarksLessThan(int mark);

}
