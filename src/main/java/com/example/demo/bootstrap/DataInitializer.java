package com.example.demo.bootstrap;

import com.example.demo.domain.mappedsuperclass.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        Book bookDDD = new Book("Domain Driver Design", "123", "RandomHouse");

        System.out.println("bookDDD getId: " + bookDDD.getId());

        Book savedBookDDD = bookRepository.save(bookDDD);

        System.out.println("savedBookDDD getId: " + savedBookDDD.getId());

        Book bookSIA = new Book("Spring in Action", "234234", "Oriely");

        System.out.println("bookSIA getId: " + bookSIA.getId());

        Book savedBookSIA = bookRepository.save(bookSIA);

        System.out.println("savedBookSIA getId: " + savedBookSIA.getId());

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book id: " + book.getId());
            System.out.println("Title: " + book.getTitle());
        });
    }
}
