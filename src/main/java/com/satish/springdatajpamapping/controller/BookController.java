package com.satish.springdatajpamapping.controller;

import com.satish.springdatajpamapping.model.Book;
import com.satish.springdatajpamapping.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book")
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
