package com.probal.crudapp.controller;


import com.probal.crudapp.model.Books;
import com.probal.crudapp.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.*;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    // retrieve all books details
    @GetMapping("/book")
    private List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    // retrieve specific book details
    @GetMapping("/book/{bookId}")
    private Books getBooks(@PathVariable("bookId") int bookId) {
        return booksService.getBooksById(bookId);
    }

    // delete specific book
    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId) {
        booksService.deleteBook(bookId);
    }

    // creating post mapping that post the book detail in the database
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookId();
    }

    // Update book details
    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }

}
