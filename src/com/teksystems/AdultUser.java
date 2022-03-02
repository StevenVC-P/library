package com.teksystems;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public AdultUser(int age, String bookType){
        this.age=age;
        this.bookType= bookType;
    }

    @Override
    public String registerAccount() {
        if(age>12){
            return "You have successfully registered under an Adults Account";
        } else {
            return "Sorry, Age must be greater than 12 to register as an adult.";
        }
    }

    @Override
    public String requestBook() {
        if(bookType.equals("Fiction")){
            return "Book Issued successfully, please return the book within 10 days";
        } else {
            return "Oops, you are allowed to take only adult Fiction books";
        }
    }
}
