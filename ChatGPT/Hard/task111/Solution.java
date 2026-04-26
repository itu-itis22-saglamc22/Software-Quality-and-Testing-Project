package task111;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public Map<String, Integer> histogram(String test) {
        Map<String, Integer> counts = new HashMap<>();

        if (test == null || test.isEmpty()) {
            return counts;
        }

        for (String letter : test.split(" ")) {
            if (!letter.isEmpty()) {
                counts.put(letter, counts.getOrDefault(letter, 0) + 1);
            }
        }

        int maxCount = 0;
        for (int count : counts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}