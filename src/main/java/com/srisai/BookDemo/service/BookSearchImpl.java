package com.srisai.BookDemo.service;

import com.srisai.BookDemo.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BookSearchImpl implements BookSearch {


    @Override
    public Book getBooks(String bookId) {

        Book book = new Book();
        book.setBookId( bookId );
        book.setBookName( "Sai Satcharitra" );
        book.setAuthor("Jayakar");

        return book;
    }
}
