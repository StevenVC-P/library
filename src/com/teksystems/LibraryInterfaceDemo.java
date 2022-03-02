package com.teksystems;

public class LibraryInterfaceDemo {

    public void libraryInterfaceDemo() {
        KidUser Peter = new KidUser(10, "Kids");
        KidUser Megan = new KidUser(18,"Fiction");
        AdultUser Steven = new AdultUser(5, "Kids");
        AdultUser Rachel = new AdultUser(23,"Fiction");

        System.out.printf("Peter's Registration: %s\n", Peter.registerAccount());
        System.out.printf("Peter's Checkout Status: %s\n", Peter.requestBook());
        System.out.printf("Megan's Registration: %s\n", Megan.registerAccount());
        System.out.printf("Megan's Checkout Status: %s\n", Megan.requestBook());

        System.out.printf("Steven's Registration: %s\n", Steven.registerAccount());
        System.out.printf("Steven's Checkout Status: %s\n", Steven.requestBook());
        System.out.printf("Rachel's Registration: %s\n", Rachel.registerAccount());
        System.out.printf("Rachel's Checkout Status: %s\n", Rachel.requestBook());
    }
}
