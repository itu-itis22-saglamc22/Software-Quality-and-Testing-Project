package task8;

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> sumProduct(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Arrays.asList(0, 1);
        }

        int sum = 0;
        int product = 1;

        for (int n : numbers) {
            sum += n;
            product *= n;
        }

        return Arrays.asList(sum, product);
    }
}