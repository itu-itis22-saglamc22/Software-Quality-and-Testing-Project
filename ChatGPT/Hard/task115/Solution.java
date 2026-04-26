package task115;

import java.util.List;

class Solution {
    public int maxFill(List<List<Integer>> grid, int capacity) {
        if (grid == null || grid.isEmpty() || capacity <= 0) {
            return 0;
        }

        int totalDrops = 0;

        for (List<Integer> row : grid) {
            int waterUnits = 0;

            for (int cell : row) {
                waterUnits += cell;
            }

            totalDrops += (waterUnits + capacity - 1) / capacity;
        }

        return totalDrops;
    }
}