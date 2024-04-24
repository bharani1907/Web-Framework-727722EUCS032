package com.examly.springapp.bharaniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.bharanimodel.BharaniDoor;
import com.examly.springapp.bharanirepository.DoorRepo;

@Service
public class BharaniDoorService {
    @Autowired
    private DoorRepo doorRepo;

    public BharaniDoor postData(BharaniDoor door) {
        return doorRepo.save(door);
    }

    public List<BharaniDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public BharaniDoor updateDetail(int doorid, BharaniDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<BharaniDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<BharaniDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public BharaniDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}