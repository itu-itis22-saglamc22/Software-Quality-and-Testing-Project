package task9;

import java.util.*;

class Solution {
    public List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) {
            return result;
        }

        // Initialize rollingMax with the first element
        int currentMax = numbers.get(0);

        for (int n : numbers) {
            // Update currentMax if the current number is larger
            if (n > currentMax) {
                currentMax = n;
            }
            // Add the current state of the maximum to the result list
            result.add(currentMax);
        }

        return result;
    }
}