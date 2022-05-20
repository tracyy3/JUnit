package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoilingWaterTest {

    @DisplayName("Test isBoiling() method")
    @Test
    void testIsBoiling() {
        assertEquals("Water is boiling!", BoilingWater.isBoiling(213));
        assertEquals("It's starting to boil!", BoilingWater.isBoiling(212));
        assertEquals("Water is not boiling :(", BoilingWater.isBoiling(211));
    }

}