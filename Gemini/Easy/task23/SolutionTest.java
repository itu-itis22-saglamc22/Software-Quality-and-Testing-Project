package task23;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.strlen("") == 0,
                s.strlen("x") == 1,
                s.strlen("asdasnakj") == 9);

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 23: All tests passed successfully!");
        }
    }
}
