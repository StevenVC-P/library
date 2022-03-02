package com.teksystems;

public class KidUser implements LibraryUser{
    int age;
    String bookType;

    public KidUser(int age, String bookType){
        this.age=age;
        this.bookType= bookType;
    }

    @Override
    public String registerAccount() {
        if(age<=12){
            return "You have successfully registered under a Kids Account";
        } else {
            return "Sorry, Age must be less than 12 to register as a kid.";
        }
    }

    @Override
    public String requestBook() {
        if(bookType.equals("Kids")){
            return "Book Issued successfully, please return the book within 10 days";
        } else {
            return "Oops, you are allowed to take only kids books";
        }
    }
}
