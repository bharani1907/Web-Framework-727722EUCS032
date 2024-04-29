package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BharaniBook;
import com.example.demo.service.BharaniBookService;

@RestController
public class BharaniBookController {
    @Autowired
    private BharaniBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<BharaniBook> getBookById(@PathVariable Long bookId) {
        BharaniBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
