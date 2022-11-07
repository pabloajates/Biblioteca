package com.Pajates.biblioteca;

import com.Pajates.biblioteca.Book;
import com.Pajates.biblioteca.User;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {

    /** Private **/
    private String fechapres;
    private String fechadev;
    private List<Book> book = new ArrayList<>();
    private List<User> user = new ArrayList<>();
    /** Public **/
    public void setFechapres(String fechapres){
        this.fechapres = fechapres;
    }
    public String getFechapres(){
        return fechapres;
    }
    public void setFechadev(String fechadev){
        this.fechadev = fechadev;
    }
    public String getFechadev(){
        return fechapres;
    }

    public void addBook(Book book){
        this.book.add(book);
    }
    public List<Book> getBook() {
        return book;
    }

    public void addUser(User user){
        this.user.add(user);
    }
    public List<User> getUser() {
        return user;
    }

}
