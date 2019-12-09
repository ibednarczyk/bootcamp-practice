package com.kodilla.collections.adv.immutable.special.homework;
import java.util.List;

public class BookManager {

    public List<Book> library;

    public BookManager(List<Book> library) {
        this.library = library;
    }


    public Book createBook(String title, String author) {
        for (Book book : library) {
            if (title.equals(book.getTitle()) && (author.equals(book.getAuthor()))) {
                System.out.println("This book exists in the library");
            }
        }
        return new Book(title,author);

    }
}



