package com.win.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    void getNumber() {
        Counter counter = new Counter(15);
        assertEquals(15, counter.getNumber());
    }
}