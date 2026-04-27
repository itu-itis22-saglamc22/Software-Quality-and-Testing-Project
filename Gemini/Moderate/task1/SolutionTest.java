package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                s.separateParenGroups("(()()) ((())) () ((())()())").equals(Arrays.asList(
                        "(()())", "((()))", "()", "((())()())")),
                s.separateParenGroups("() (()) ((())) (((())))").equals(Arrays.asList(
                        "()", "(())", "((()))", "(((())))")),
                s.separateParenGroups("(()(())((())))").equals(Arrays.asList(
                        "(()(())((())))")),
                s.separateParenGroups("( ) (( )) (( )( ))").equals(Arrays.asList("()", "(())", "(()())")));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 1: All tests passed successfully!");
        }
    }
}
