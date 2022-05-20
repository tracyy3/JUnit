package com.win.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void getDogName() {
        Animal animal = new Animal("MollyBlu");
        assertEquals("MollyBlu", animal.getDogName());
    }
}