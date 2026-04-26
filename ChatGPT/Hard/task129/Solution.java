package task129;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> minPath(List<List<Integer>> grid, int k) {
        List<Integer> result = new ArrayList<>();

        if (grid == null || grid.isEmpty() || k <= 0) {
            return result;
        }

        int n = grid.size();
        int rowOfOne = -1;
        int colOfOne = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    rowOfOne = i;
                    colOfOne = j;
                    break;
                }
            }
            if (rowOfOne != -1) {
                break;
            }
        }

        List<Integer> neighbors = new ArrayList<>();

        if (rowOfOne > 0) {
            neighbors.add(grid.get(rowOfOne - 1).get(colOfOne));
        }
        if (rowOfOne < n - 1) {
            neighbors.add(grid.get(rowOfOne + 1).get(colOfOne));
        }
        if (colOfOne > 0) {
            neighbors.add(grid.get(rowOfOne).get(colOfOne - 1));
        }
        if (colOfOne < grid.get(rowOfOne).size() - 1) {
            neighbors.add(grid.get(rowOfOne).get(colOfOne + 1));
        }

        int minNeighbor = Collections.min(neighbors);

        for (int i = 0; i < k; i++) {
            result.add(i % 2 == 0 ? 1 : minNeighbor);
        }

        return result;
    }
}