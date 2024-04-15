package com.example.day4.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StudentModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private int regNo;
private String studentName;
private String studentMarks;
public int getRegNo() {
    return regNo;
}
public void setRegNo(int regNo) {
    this.regNo = regNo;
}
public String getStudentName() {
    return studentName;
}
public void setStudentName(String studentName) {
    this.studentName = studentName;
}
public String getStudentMarks() {
    return studentMarks;
}
public void setStudentMarks(String studentMarks) {
    this.studentMarks = studentMarks;
}


}
