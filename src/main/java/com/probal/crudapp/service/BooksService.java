package com.probal.crudapp.service;

import com.probal.crudapp.model.Books;
import com.probal.crudapp.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    public Books getBooksById(int bookId) {
        return booksRepository.findById(bookId).get();
    }

    public void deleteBook(int bookId) {
        booksRepository.deleteById(bookId);
    }


    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    //updating a record
    public void update(Books books, int bookid)
    {
        booksRepository.save(books);
    }
}
