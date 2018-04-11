package com.sda.service.bookstore;

public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private String isbn;

    public Book(String title, int numberOfPages, String author, String isbn) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
