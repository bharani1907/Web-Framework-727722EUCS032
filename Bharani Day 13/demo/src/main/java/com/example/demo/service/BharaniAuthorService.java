package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BharaniAuthor;
import com.example.demo.repository.BharaniAuthorRepository;

@Service
public class BharaniAuthorService {
    @Autowired
    private BharaniAuthorRepository authorRepository;

    public BharaniAuthor saveAuthor(BharaniAuthor author) {
        return authorRepository.save(author);
    }

    public BharaniAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<BharaniAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public BharaniAuthor updateAuthor(Long id, BharaniAuthor author) {
        BharaniAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
