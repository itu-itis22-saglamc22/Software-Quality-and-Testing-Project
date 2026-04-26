package task140;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.fixSpaces("Example"), "Example"),
                Objects.equals(s.fixSpaces("Mudasir Hanif "), "Mudasir_Hanif_"),
                Objects.equals(s.fixSpaces("Yellow Yellow  Dirty  Fellow"), "Yellow_Yellow__Dirty__Fellow"),
                Objects.equals(s.fixSpaces("Exa   mple"), "Exa-mple"),
                Objects.equals(s.fixSpaces("   Exa 1 2 2 mple"), "-Exa_1_2_2_mple"),
                Objects.equals(s.fixSpaces(" Example   3"), "_Example-3"));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 140: All tests passed successfully!");
        }
    }
}