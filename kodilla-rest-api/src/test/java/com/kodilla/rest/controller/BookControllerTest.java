package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    @Test
    public void shouldFetchBook(){
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
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
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("Buszujący w zbożu", "J.D. Salinger");
        //when
        bookController.addBook(bookDto);
        //then
        Mockito.doNothing().when(bookServiceMock).addBook(bookDto);
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }


}