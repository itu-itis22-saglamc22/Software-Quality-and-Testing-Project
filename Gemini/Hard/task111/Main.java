package task111;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Expected Maps for testing
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 2);
        map1.put("b", 2);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("a", 1);
        map3.put("b", 1);
        map3.put("c", 1);
        map3.put("d", 1);
        map3.put("g", 1);

        Map<String, Integer> map5 = new HashMap<>();
        map5.put("b", 4);

        List<Boolean> correct = Arrays.asList(
                s.histogram("a b b a").equals(map1),
                s.histogram("a b c a b").equals(map1), // Ties 'a' and 'b' at 2
                s.histogram("a b c d g").equals(map3),
                s.histogram("b b b b a").equals(map5),
                s.histogram("").isEmpty(),
                s.histogram("a").get("a") == 1);

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 111: All tests passed successfully!");
        }
    }
}