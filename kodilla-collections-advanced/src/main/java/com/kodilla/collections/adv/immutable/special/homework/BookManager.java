package com.kodilla.collections.adv.immutable.special.homework;
import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public Set<Book> library;

    public BookManager(){
        library= new HashSet<>();
    }
    public Book createBook(String title, String author) {
        return new Book (title,author);
    }



}



