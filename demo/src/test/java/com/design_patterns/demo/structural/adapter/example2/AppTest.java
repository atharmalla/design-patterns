package com.design_patterns.demo.structural.adapter.example2;


import com.design_patterns.demo.structural.adapter.example2.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Tests that Adapter example runs without errors.
 */
class AppTest {

    /**
     * Check whether the execution of the main method in {@link App}
     * throws an exception.
     */

    @Test
    void shouldExecuteApplicationWithoutException() {

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}