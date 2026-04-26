package task37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sortEven(List<Integer> l) {
        if (l == null || l.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>(l);
        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i < result.size(); i += 2) {
            evens.add(result.get(i));
        }

        Collections.sort(evens);

        for (int i = 0; i < result.size(); i += 2) {
            result.set(i, evens.get(i / 2));
        }

        return result;
    }
}