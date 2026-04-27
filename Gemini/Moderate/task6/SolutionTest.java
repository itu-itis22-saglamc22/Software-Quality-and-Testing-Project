package task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.parseNestedParens("(()()) ((())) () ((())()())").equals(Arrays.asList(2, 3, 1, 3)));
        if (correct.contains(false)) {
            throw new AssertionError("Test Case Failed!");
        } else {
            System.out.println("Task 6: All tests passed!");
        }
    }
}
