package task111;

import java.util.*;

class Solution {
    /**
     * Returns a map of letters with the highest repetition count.
     * If multiple letters tie for the maximum count, all are included.
     */
    public Map<String, Integer> histogram(String test) {
        Map<String, Integer> result = new HashMap<>();

        // Handle empty or null string
        if (test == null || test.trim().isEmpty()) {
            return result;
        }

        // 1. Split string and count frequencies of each letter
        String[] letters = test.split(" ");
        Map<String, Integer> counts = new HashMap<>();
        int maxCount = 0;

        for (String s : letters) {
            if (s.isEmpty())
                continue;

            int currentCount = counts.getOrDefault(s, 0) + 1;
            counts.put(s, currentCount);

            // Track the highest frequency found so far
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        // 2. Filter the map to keep only those with maxCount
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}