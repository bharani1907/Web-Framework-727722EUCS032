package com.examly.springapp.bharanirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.bharanimodel.BharaniDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface DoorRepo extends JpaRepository<BharaniDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<BharaniDoor> findByColor(String color);

    public List<BharaniDoor> findByDoorType(String doortype);
}
