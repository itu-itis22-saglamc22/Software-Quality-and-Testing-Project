package task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Testing using an epsilon (1e-6) to account for floating-point precision
        List<Boolean> correct = Arrays.asList(
                Math.abs(s.truncateNumber(3.5) - 0.5) < 1e-6,
                Math.abs(s.truncateNumber(1.33) - 0.33) < 1e-6,
                Math.abs(s.truncateNumber(123.456) - 0.456) < 1e-6,
                Math.abs(s.truncateNumber(0.123) - 0.123) < 1e-6,
                Math.abs(s.truncateNumber(10.0) - 0.0) < 1e-6);

        if (correct.contains(false)) {
            // Find which index failed for easier debugging
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("All tests passed successfully!");
        }
    }
}
