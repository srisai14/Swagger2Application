package com.srisai.BookDemo.model;


import java.util.Objects;

public class Book {

    private String bookId;
    private String bookName;
    private String author;

    public Book() {
    }

    public Book(String bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals( getBookId(), book.getBookId() ) &&
                Objects.equals( getBookName(), book.getBookName() ) &&
                Objects.equals( getAuthor(), book.getAuthor() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getBookId(), getBookName(), getAuthor() );
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
