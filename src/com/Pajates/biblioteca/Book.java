package com.Pajates.biblioteca;

public class Book {

    private Integer isbn;
    private String author;
    private String name;
    private String genre;
    private String date;

    public Integer getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
