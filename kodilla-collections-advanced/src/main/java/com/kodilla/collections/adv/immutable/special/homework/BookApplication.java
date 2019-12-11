package com.kodilla.collections.adv.immutable.special.homework;
public class BookApplication {
    public static void main(String[] args) {


        BookManager book = new BookManager();

        Book book1 = book.createBook("Wiedzmin", "Andrzej Sapkowski");
        Book book2 = book.createBook("Harry Potter", "J.K.Rowling");
        Book book3 = book.createBook("Ogniem i mieczem", "Henryk Sienkiewicz");

        System.out.println(book.getSize());
        book.createBook("Ogniem i mieczem", "Henryk Sienkiewicz");
        System.out.println(book.getSize());

        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());







    }
}
