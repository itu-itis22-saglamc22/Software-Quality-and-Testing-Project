package task13;

import java.util.*;

public class Solution {
    /**
     * Out of list of strings, return the longest one. Return the first one in case
     * of multiple
     * strings of the same length. Return Optional.empty in case the input list is
     * empty.
     */
    public Optional<String> longest(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return Optional.empty();
        }

        String longestStr = strings.get(0);

        for (String s : strings) {
            if (s.length() > longestStr.length()) {
                longestStr = s;
            }
        }

        return Optional.of(longestStr);
    }
}