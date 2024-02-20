package com.petproject.controller;

import com.petproject.model.Book;
import com.petproject.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("books")
public class BooksController {


    @Autowired
    private BooksRepository booksRepository;

    @PostMapping("/add")
    public @ResponseBody Book addBooks(@RequestBody Book book) {
       return booksRepository.save(book);
    }
}
