package org.bukola.katas.sumofpositives;

import static org.junit.jupiter.api.Assertions.*;

class MainSumOfPositivesTest {

    @org.junit.jupiter.api.Test
    void testSumOfPositives() {
        int[] array = new int[]{-1, -5, 0, -10, 20, 30, 50};
       assertEquals(100, MainSumOfPositives.sumOfPositiveNumbers(array));
    }
}