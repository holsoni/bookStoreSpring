package com.example.bookstorespring.service;

import com.example.bookstorespring.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
