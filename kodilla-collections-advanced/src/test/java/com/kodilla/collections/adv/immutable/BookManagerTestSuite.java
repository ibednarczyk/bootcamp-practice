package com.kodilla.collections.adv.immutable;

import com.kodilla.collections.adv.immutable.special.homework.BookManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookManagerTestSuite {
    @Test
    public void shouldAddUniqueBooks(){
        BookManager bookManager = new BookManager();

        bookManager.createBook("Book1", "Author1");
        bookManager.createBook("Book2", "Author2");
        bookManager.createBook("Book2", "Author2");

        Assertions.assertEquals(2, bookManager.getSize());


    }
}
