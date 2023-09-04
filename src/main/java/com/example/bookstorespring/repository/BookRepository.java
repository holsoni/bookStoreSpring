package com.example.bookstorespring.repository;

import com.example.bookstorespring.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
