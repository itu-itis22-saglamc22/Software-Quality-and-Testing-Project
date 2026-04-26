package task110;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4)), "YES"),
                Objects.equals(s.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 5, 3, 4)), "NO"),
                Objects.equals(s.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 1, 4, 3)), "YES"),
                Objects.equals(s.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 4)), "YES"),
                Objects.equals(s.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 3)), "NO"),
                Objects.equals(s.exchange(Arrays.asList(3, 2, 6, 1, 8, 9), Arrays.asList(3, 5, 5, 1, 1, 1)), "NO"),
                Objects.equals(s.exchange(Arrays.asList(100, 200), Arrays.asList(200, 200)), "YES"));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 110: All tests passed successfully!");
        }
    }
}