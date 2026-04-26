package task129;

import java.util.*;

class Solution {
    /**
     * Finds the lexicographically minimum path of length k in the grid.
     */
    public List<Integer> minPath(List<List<Integer>> grid, int k) {
        int n = grid.size();
        int targetRow = -1;
        int targetCol = -1;

        // 1. Locate the cell containing the value 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    targetRow = i;
                    targetCol = j;
                    break;
                }
            }
        }

        // 2. Find the smallest neighbor of the cell containing 1
        int minNeighbor = Integer.MAX_VALUE;
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        for (int[] dir : directions) {
            int newRow = targetRow + dir[0];
            int newCol = targetCol + dir[1];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                minNeighbor = Math.min(minNeighbor, grid.get(newRow).get(newCol));
            }
        }

        // 3. Construct the path by bouncing between 1 and minNeighbor
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                path.add(1);
            } else {
                path.add(minNeighbor);
            }
        }

        return path;
    }
}