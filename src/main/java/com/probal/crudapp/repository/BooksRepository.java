package com.probal.crudapp.repository;

import com.probal.crudapp.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
