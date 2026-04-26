package task12;

import java.util.*;

class Solution {
    /**
     * Out of list of strings, return the longest one.
     * Return the first one in case of multiple strings of the same length.
     * Return Optional.empty in case the input list is empty.
     */
    public Optional<String> longest(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return Optional.empty();
        }

        String longest = strings.get(0);

        for (String s : strings) {
            // Using > ensures that if lengths are equal, we keep the first one found
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        return Optional.of(longest);
    }
}