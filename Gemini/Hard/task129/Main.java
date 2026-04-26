package task129;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.minPath(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9)), 3)
                        .equals(Arrays.asList(1, 2, 1)),
                s.minPath(Arrays.asList(Arrays.asList(5, 9, 3), Arrays.asList(4, 1, 6), Arrays.asList(7, 8, 2)), 1)
                        .equals(List.of(1)),
                s.minPath(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)), 4)
                        .equals(Arrays.asList(1, 2, 1, 2)));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 129: All tests passed successfully!");
        }
    }
}