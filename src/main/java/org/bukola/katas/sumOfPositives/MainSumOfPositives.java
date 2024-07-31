package org.bukola.katas.sumofpositives;

//code challenge from codewars - https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java

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
