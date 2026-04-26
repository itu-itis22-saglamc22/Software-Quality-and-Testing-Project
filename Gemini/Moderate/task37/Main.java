package task37;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.sortEven(new ArrayList<>(Arrays.asList(1, 2, 3))).equals(Arrays.asList(1, 2, 3)),
                s.sortEven(new ArrayList<>(Arrays.asList(5, 6, 3, 4))).equals(Arrays.asList(3, 6, 5, 4)),
                s.sortEven(new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)))
                        .equals(Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123)),
                s.sortEven(new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10)))
                        .equals(Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10)));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 37: All tests passed successfully!");
        }
    }
}