package task6;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> parseNestedParens(String parenString) {
        List<Integer> result = new ArrayList<>();

        if (parenString == null || parenString.isEmpty()) {
            return result;
        }

        String[] groups = parenString.split(" ");

        for (String group : groups) {
            if (!group.isEmpty()) {
                int depth = 0;
                int maxDepth = 0;

                for (char c : group.toCharArray()) {
                    if (c == '(') {
                        depth++;
                        maxDepth = Math.max(maxDepth, depth);
                    } else if (c == ')') {
                        depth--;
                    }
                }

                result.add(maxDepth);
            }
        }

        return result;
    }
}