package task122;

import java.util.*;

class Solution {
    /**
     * Returns the sum of elements with at most two digits from the first k
     * elements.
     */
    public int addElements(List<Integer> arr, int k) {
        int sum = 0;

        // Iterate only through the first k elements
        for (int i = 0; i < k; i++) {
            int val = arr.get(i);

            // Check if the number has at most two digits
            // This includes numbers from -99 to 99
            if (Math.abs(val) <= 99) {
                sum += val;
            }
        }

        return sum;
    }
}