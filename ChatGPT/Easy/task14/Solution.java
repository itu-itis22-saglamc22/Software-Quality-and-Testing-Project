package task14;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> allPrefixes(String string) {
        List<String> result = new ArrayList<>();

        if (string == null || string.isEmpty()) {
            return result;
        }

        for (int i = 1; i <= string.length(); i++) {
            result.add(string.substring(0, i));
        }

        return result;
    }
}