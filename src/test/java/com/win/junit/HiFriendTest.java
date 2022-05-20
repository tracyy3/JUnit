package com.win.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HiFriendTest {

    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend() {
        assertEquals("Hi Larry Sprinkle!", HiFriend.hiFriend("Larry Sprinkle"));
    }

}