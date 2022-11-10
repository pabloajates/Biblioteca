package com.Pajates.biblioteca;

public class Loan {

    private Integer id;
    private String giveDate;
    private String returnDate;
    private String userData;

    private String bookIsbn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGiveDate(String giveDate){
        this.giveDate = giveDate;
    }
    public String getGiveDate(){
        return giveDate;
    }
    public void setReturnDate(String returnDate){
        this.returnDate = returnDate;
    }
    public String getReturnDate(){
        return returnDate;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getUserData() {
        return userData;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }
}
