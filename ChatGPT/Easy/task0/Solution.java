package task0;

import java.util.List;

class Solution {
    public boolean hasCloseElements(List<Double> numbers, double threshold) {
        if (numbers == null || numbers.size() < 2) {
            return false;
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                double distance = Math.abs(numbers.get(i) - numbers.get(j));
                if (distance < threshold) {
                    return true;
                }
            }
        }

        return false;
    }
}