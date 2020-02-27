package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    private BookService bookServiceMock = Mockito.mock(BookService.class);
    private BookController bookController = new BookController(bookServiceMock);

    @Test
    public void shouldFetchBook(){
        //given
        List<BookDto> booksLists = new ArrayList<>();
        booksLists.add(new BookDto("Title 1", "Author 1"));
        booksLists.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksLists);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);

    }

    @Test
    public void shouldAddBook(){
        //given
        BookDto bookDto = new BookDto("Buszujący w zbożu", "J.D. Salinger");
        //when
        bookController.addBook(bookDto);
        //then
        Mockito.doNothing().when(bookServiceMock).addBook(bookDto);
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }

    @Test
    public void shouldRemoveBook(){
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 3", "Author 3"));
        booksList.add(new BookDto("Title 4", "Author 4"));
        booksList.add(new BookDto("Title 5", "Author 5"));
        booksList.remove(new BookDto("Title 4", "Author 4"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        bookController.removeBook(new BookDto("Title 4", "Author 4"));
        List<BookDto> resultList = bookController.getBooks();
        //then
        Mockito.verify(bookServiceMock, Mockito.times(1)).removeBook(new BookDto("Title 4", "Author 4"));
        Assert.assertEquals(2, resultList.size());



    }


}