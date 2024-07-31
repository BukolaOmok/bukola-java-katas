package org.bukola.katas.sumofpositives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainSumOfPositivesTest {

    @Test
    void basic() {
        int[] inputNumbers = new int[]{-1, -5, 0, -10, 20, 30, 50};
       assertEquals(100, MainSumOfPositives.sumOfPositiveNumbers(inputNumbers));

    }
    @Test
    void emptyInput () {
        int[] inputNumbers = new int[]{};
        assertEquals(0, MainSumOfPositives.sumOfPositiveNumbers(inputNumbers));
    }
}