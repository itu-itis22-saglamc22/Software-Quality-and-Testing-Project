package task9;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        if (numbers == null || numbers.isEmpty()) {
            return result;
        }

        int rollingMax = numbers.get(0);
        result.add(rollingMax);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > rollingMax) {
                rollingMax = numbers.get(i);
            }
            result.add(rollingMax);
        }

        return result;
    }
}