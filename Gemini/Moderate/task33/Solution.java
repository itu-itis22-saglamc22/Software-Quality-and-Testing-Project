package task33;

import java.util.*;

class Solution {
    /**
     * Identical to l in indices not divisible by three,
     * while values at indices divisible by three are sorted.
     */
    public List<Integer> sortThird(List<Integer> l) {
        if (l == null || l.size() < 1) {
            return l;
        }

        // 1. Extract values at indices 0, 3, 6...
        List<Integer> divisibleByThreeValues = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 3) {
            divisibleByThreeValues.add(l.get(i));
        }

        // 2. Sort those extracted values
        Collections.sort(divisibleByThreeValues);

        // 3. Create a result list and re-insert sorted values
        List<Integer> result = new ArrayList<>(l);
        int sortedIndex = 0;
        for (int i = 0; i < result.size(); i += 3) {
            result.set(i, divisibleByThreeValues.get(sortedIndex++));
        }

        return result;
    }
}