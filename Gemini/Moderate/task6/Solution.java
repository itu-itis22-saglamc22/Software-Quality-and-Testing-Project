package task6;

import java.util.*;

class Solution {
    public List<Integer> parseNestedParens(String paren_string) {
        List<Integer> result = new ArrayList<>();
        if (paren_string == null || paren_string.isEmpty()) {
            return result;
        }

        // Split by space to get individual groups
        String[] groups = paren_string.split(" ");

        for (String group : groups) {
            if (group.isEmpty())
                continue;

            int maxDepth = 0;
            int currentDepth = 0;

            for (char c : group.toCharArray()) {
                if (c == '(') {
                    currentDepth++;
                    // Update maxDepth if we've reached a new deepest level
                    if (currentDepth > maxDepth) {
                        maxDepth = currentDepth;
                    }
                } else if (c == ')') {
                    currentDepth--;
                }
            }
            result.add(maxDepth);
        }
        return result;
    }
}