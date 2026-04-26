package task1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> separateParenGroups(String parenString) {
        List<String> result = new ArrayList<>();

        if (parenString == null || parenString.isEmpty()) {
            return result;
        }

        StringBuilder currentString = new StringBuilder();
        int currentDepth = 0;

        for (char c : parenString.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                currentString.append(c);
            } else if (c == ')') {
                currentDepth--;
                currentString.append(c);

                if (currentDepth == 0) {
                    result.add(currentString.toString());
                    currentString.setLength(0);
                }
            }
        }

        return result;
    }
}