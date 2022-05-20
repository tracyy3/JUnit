package com.win.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOUTest {

    @Test
    @DisplayName("Test setSum and howMuchDoIOweTo methods in hashmap_IOU.IOU class" +
            " to see that class method sets and returns the correct hashmap value pair")
    public void IOUclassMethodsTest() {
        IOU test = new IOU();

        test.setSum("Test", 100.50);

        assertEquals(100.50, test.howMuchDoIOweTo("Test"));
    }
}