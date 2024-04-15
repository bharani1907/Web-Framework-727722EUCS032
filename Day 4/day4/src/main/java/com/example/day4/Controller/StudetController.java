package com.example.day4.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.Model.StudentModel;

@RestController
@RequestMapping("/welcome")
public class StudetController {
@GetMapping("/start")
public String welcome()
{
    return "Welcome to all";
}
@PostMapping("/post")
public StudentModel akshu()
{
    StudentModel obj=new StudentModel();
    obj.setRegNo(12);
    return obj;
}
}
