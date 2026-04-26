package task163;

import java.util.*;

class Solution {
    /**
     * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.
     */
    public List<Integer> generateIntegers(int a, int b) {
        // Determine the actual range
        int lower = Math.min(a, b);
        int upper = Math.max(a, b);

        List<Integer> result = new ArrayList<>();

        // Even digits are only found in the range [2, 8]
        // Single digits are 0-9. Even single digits are 0, 2, 4, 6, 8.
        // The prompt examples imply positive even digits (2, 4, 6, 8).
        for (int i = 2; i <= 8; i += 2) {
            if (i >= lower && i <= upper) {
                result.add(i);
            }
        }

        return result;
    }
}