package com.srisai.BookDemo.controller;

import com.srisai.BookDemo.model.Book;
import com.srisai.BookDemo.service.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/srisai")
public class BookController {

    @Autowired
    BookSearch bookSearch;

    @GetMapping("/books")
    public Book getBooks(@RequestParam("id") String bookId) {
        System.out.println("om srisai "+bookId);

       return bookSearch.getBooks( bookId );
    }
}
