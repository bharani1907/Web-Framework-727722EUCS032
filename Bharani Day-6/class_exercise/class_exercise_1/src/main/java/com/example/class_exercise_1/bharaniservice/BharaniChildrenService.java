package com.example.class_exercise_1.bharaniservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.bharanirepository.BharaniChildrenRepo;
import com.example.class_exercise_1.bharanimodel.BharaniChildren;

@Service
public class BharaniChildrenService {

     @Autowired
     public BharaniChildrenRepo childrenRepo;

     public List<BharaniChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public BharaniChildren save(BharaniChildren children) {
          return childrenRepo.save(children);

     }

     public List<BharaniChildren> sortedPage(int offset, int pagesize, String field) {
          Page<BharaniChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<BharaniChildren> pagination(int offset, int pagesize) {
          Page<BharaniChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
