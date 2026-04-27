package task12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.longest(new ArrayList<>(List.of())).isEmpty(),
                Objects.equals(s.longest(new ArrayList<>(Arrays.asList("x", "y", "z"))).get(), "x"),
                Objects.equals(
                        s.longest(new ArrayList<>(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc"))).get(),
                        "zzzz"),
                Objects.equals(s.longest(new ArrayList<>(Arrays.asList("a", "b", "c"))).get(), "a"),
                Objects.equals(s.longest(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))).get(), "ccc"));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 12: All tests passed successfully!");
        }
    }
}
