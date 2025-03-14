package com.design_patterns.demo.creational.prototype.example2;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

/**
 * Application test
 */
class AppTest {

    @Test
    void shouldExecuteApplicationWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}