package com.win.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooksTest {

    @Test
    void getTitle() {
        Books book = new Books("Atomic Habits");
        assertEquals("Atomic Habits", book.getTitle());
    }

    @Test
    void getPageNum() {
        Books book = new Books("The Subtle Art of Not giving a F*ck", 328, 2016);
        assertEquals(328, book.getPageNum());
    }

    @Test
    void getPubYear() {
        Books book = new Books("Everything is F*cked", 281, 2020);
        assertEquals(2020, book.getPubYear());
    }
}