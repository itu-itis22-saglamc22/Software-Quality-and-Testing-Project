package task1;

import java.util.*;

public class Solution {
    /**
     * Separate nested parentheses groups into separate strings.
     * Ignore spaces and identify balanced groups.
     */
    public List<String> separateParenGroups(String paren_string) {
        List<String> result = new ArrayList<>();
        if (paren_string == null || paren_string.isEmpty()) {
            return result;
        }

        StringBuilder currentGroup = new StringBuilder();
        int balance = 0;

        for (int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);

            if (c == '(') {
                balance++;
                currentGroup.append(c);
            } else if (c == ')') {
                balance--;
                currentGroup.append(c);
            }

            // A balance of 0 indicates a top-level group is complete
            if (balance == 0 && currentGroup.length() > 0) {
                result.add(currentGroup.toString());
                currentGroup.setLength(0); // Clear the builder for the next group
            }
        }

        return result;
    }
}