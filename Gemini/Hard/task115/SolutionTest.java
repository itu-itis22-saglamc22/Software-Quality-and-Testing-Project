package task115;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.maxFill(
                        Arrays.asList(Arrays.asList(0, 0, 1, 0), Arrays.asList(0, 1, 0, 0), Arrays.asList(1, 1, 1, 1)),
                        1) == 6,
                s.maxFill(Arrays.asList(Arrays.asList(0, 0, 1, 1), Arrays.asList(0, 0, 0, 0), Arrays.asList(1, 1, 1, 1),
                        Arrays.asList(0, 1, 1, 1)), 2) == 5,
                s.maxFill(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0)), 5) == 0,
                s.maxFill(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 1, 1)), 2) == 4,
                s.maxFill(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 1, 1)), 9) == 2);

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 115: All tests passed successfully!");
        }
    }
}
