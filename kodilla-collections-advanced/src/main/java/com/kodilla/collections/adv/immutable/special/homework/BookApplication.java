package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {

    public static void main(String[] args) {
        Set<Book> library = new HashSet<>();
        BookManager book = new BookManager();

        Book book1 = book.createBook("Wiedzmin", "Andrzej Sapkowski");
        Book book2 = book.createBook("Harry Potter", "J.K.Rowling");
        Book book3 = book.createBook("Ogniem i mieczem", "Henryk Sienkiewicz");

        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println(book.createBook("Ogniem i mieczem", "Henryk Sienkiewicz"));
        System.out.println(book3);




    }
}
