package task9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.rollingMax(new ArrayList<>(List.of())).equals(List.of()),
                s.rollingMax(new ArrayList<>(Arrays.asList(1, 2, 3, 4))).equals(Arrays.asList(1, 2, 3, 4)),
                s.rollingMax(new ArrayList<>(Arrays.asList(4, 3, 2, 1))).equals(Arrays.asList(4, 4, 4, 4)),
                s.rollingMax(new ArrayList<>(Arrays.asList(3, 2, 3, 100, 3))).equals(Arrays.asList(3, 3, 3, 100, 100)),
                s.rollingMax(new ArrayList<>(List.of(1, 2, 3, 2, 3, 4, 2))).equals(List.of(1, 2, 3, 3, 3, 4, 4)));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 9: All tests passed successfully!");
        }
    }
}
