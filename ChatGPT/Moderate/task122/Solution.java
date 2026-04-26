package task122;

import java.util.List;

class Solution {
    public int addElements(List<Integer> arr, int k) {
        if (arr == null || arr.isEmpty() || k <= 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < k && i < arr.size(); i++) {
            int val = arr.get(i);
            int absVal = Math.abs(val);

            if (absVal < 100) { // at most two digits
                sum += val;
            }
        }

        return sum;
    }
}