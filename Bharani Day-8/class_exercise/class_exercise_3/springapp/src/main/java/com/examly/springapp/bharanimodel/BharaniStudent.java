package com.examly.springapp.bharanimodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BharaniStudent {
    @Id
    private long id;
    private String name;
    private int marks;

    public BharaniStudent() {
    }

    public BharaniStudent(long id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
