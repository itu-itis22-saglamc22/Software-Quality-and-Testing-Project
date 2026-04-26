package task13;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.greatestCommonDivisor(3, 7) == 1,
                s.greatestCommonDivisor(10, 15) == 5,
                s.greatestCommonDivisor(49, 14) == 7,
                s.greatestCommonDivisor(144, 60) == 12);
        if (correct.contains(false)) {
            throw new AssertionError();
        }
        System.out.println("Task13: All tests passed.");
    }
}