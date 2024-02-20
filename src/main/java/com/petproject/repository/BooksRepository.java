package com.petproject.repository;

import com.petproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface
BooksRepository extends JpaRepository<Book, Long> {
    
}
