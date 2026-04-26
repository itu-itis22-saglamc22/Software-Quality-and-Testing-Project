package task37;

import java.util.*;

class Solution {
    /**
     * Identical to l in odd indices, while values at even indices are sorted.
     */
    public List<Integer> sortEven(List<Integer> l) {
        if (l == null || l.size() <= 1) {
            return l;
        }

        // 1. Extract values at even indices (0, 2, 4...)
        List<Integer> evenIndicesValues = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 2) {
            evenIndicesValues.add(l.get(i));
        }

        // 2. Sort the extracted values
        Collections.sort(evenIndicesValues);

        // 3. Build the result list
        List<Integer> result = new ArrayList<>(l);
        int evenValIndex = 0;
        for (int i = 0; i < result.size(); i += 2) {
            result.set(i, evenIndicesValues.get(evenValIndex++));
        }

        return result;
    }
}