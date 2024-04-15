package com.example.day4_q2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;

public class studentcontroller {
    @DeleteMapping("/delete/{id}")
    public String delete_data(@PathVariable int id)
    {
        service.delete(id);
        return "Data deleted";
    }
}
