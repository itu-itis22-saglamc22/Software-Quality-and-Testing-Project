package task131;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.digits(5) == 5,
                s.digits(54) == 5,
                s.digits(120) == 1,
                s.digits(5014) == 5,
                s.digits(98765) == 315,
                s.digits(5576543) == 2625);

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 131: All tests passed successfully!");
        }
    }
}