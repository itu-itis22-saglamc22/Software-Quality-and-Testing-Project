package task33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sortThird(List<Integer> l) {
        if (l == null || l.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>(l);
        List<Integer> thirds = new ArrayList<>();

        for (int i = 0; i < result.size(); i += 3) {
            thirds.add(result.get(i));
        }

        Collections.sort(thirds);

        for (int i = 0; i < result.size(); i += 3) {
            result.set(i, thirds.get(i / 3));
        }

        return result;
    }
}