package task115;

import java.util.*;

class Solution {
    /**
     * Calculates the total number of times buckets must be lowered to empty all
     * wells.
     */
    public int maxFill(List<List<Integer>> grid, int capacity) {
        int totalDrops = 0;

        for (List<Integer> well : grid) {
            int waterInWell = 0;

            // Count total units of water in the current well (row)
            for (int unit : well) {
                if (unit == 1) {
                    waterInWell++;
                }
            }

            if (waterInWell > 0) {
                // Calculate drops needed for this well: ceil(water / capacity)
                // We use integer arithmetic for ceil: (water + capacity - 1) / capacity
                int dropsForThisWell = (waterInWell + capacity - 1) / capacity;
                totalDrops += dropsForThisWell;
            }
        }

        return totalDrops;
    }
}