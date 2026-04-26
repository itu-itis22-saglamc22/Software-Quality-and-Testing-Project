package task163;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.generateIntegers(2, 10).equals(Arrays.asList(2, 4, 6, 8)),
                s.generateIntegers(10, 2).equals(Arrays.asList(2, 4, 6, 8)),
                s.generateIntegers(132, 2).equals(Arrays.asList(2, 4, 6, 8)),
                s.generateIntegers(17, 89).equals(List.of()),
                s.generateIntegers(2, 8).equals(Arrays.asList(2, 4, 6, 8)),
                s.generateIntegers(8, 2).equals(Arrays.asList(2, 4, 6, 8)),
                s.generateIntegers(10, 14).equals(List.of()));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 163: All tests passed successfully!");
        }
    }
}