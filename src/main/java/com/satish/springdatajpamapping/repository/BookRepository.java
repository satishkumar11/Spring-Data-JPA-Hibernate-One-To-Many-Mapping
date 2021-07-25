package com.satish.springdatajpamapping.repository;

import com.satish.springdatajpamapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
