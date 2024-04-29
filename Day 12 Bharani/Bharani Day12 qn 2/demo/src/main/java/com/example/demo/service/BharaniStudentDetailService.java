package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BharaniStudentDetail;
import com.example.demo.repository.BharaniStudentDetailRepository;
import com.example.demo.repository.BharaniStudentRepository;

@Service
public class BharaniStudentDetailService {
    @Autowired
    BharaniStudentDetailRepository studentDetailRepository;
    @Autowired
    BharaniStudentRepository studentRepository;
    public BharaniStudentDetail addStudentDetail(int id,BharaniStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
