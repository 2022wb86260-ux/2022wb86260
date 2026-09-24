package com.wb86260;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, App.multiply(3, 4));
    }
}
