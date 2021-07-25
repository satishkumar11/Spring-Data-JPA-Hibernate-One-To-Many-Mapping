package com.satish.springdatajpamapping.repository;

import com.satish.springdatajpamapping.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
