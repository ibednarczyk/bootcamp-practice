package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {

    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();

        BookManager book = new BookManager(library);

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
