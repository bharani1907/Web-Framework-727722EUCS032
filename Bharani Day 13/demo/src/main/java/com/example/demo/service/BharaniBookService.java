package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BharaniAuthor;
import com.example.demo.model.BharaniBook;
import com.example.demo.repository.BharaniAuthorRepository;
import com.example.demo.repository.BharaniBookRepository;

@Service
public class BharaniBookService {
    @Autowired
    private BharaniBookRepository bookRepository;
@Autowired
private BharaniAuthorRepository authorRepository;
    public BharaniBook saveBook(Long authorId, BharaniBook book) {
        BharaniAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public BharaniBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

