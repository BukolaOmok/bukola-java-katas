package org.bukola.katas.sumofpositives;

public class MainSumOfPositives {
    private MainSumOfPositives() {}
    public static int sumOfPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }
}
