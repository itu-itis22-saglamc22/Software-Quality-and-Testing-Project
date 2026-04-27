package task1;

import java.util.Arrays;
import java.util.List;

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
            throw new AssertionError();
        }
        System.out.println("Task1: All tests passed.");
    }
}
