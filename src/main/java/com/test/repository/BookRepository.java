package com.test.repository;

import com.test.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
