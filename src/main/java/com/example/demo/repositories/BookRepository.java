package com.example.demo.repositories;

import com.example.demo.domain.mappedsuperclass.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
