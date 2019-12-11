package com.kodilla.collections.adv.immutable.special.homework;
import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private Set<Book> library;

    public BookManager(){

        library= new HashSet<>();
    }


    public Book createBook(String title, String author) {
        Book book = new Book(title,author);
        library.add(book);
        return book;
    }

    public int getSize(){
        return library.size();
    }
}



