package task56;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.correctBracketing("<>"),
                s.correctBracketing("<<><>>"),
                s.correctBracketing("<><><<><>><>"),
                s.correctBracketing("<><><<<><><>><>><<><><<>>>"),
                !s.correctBracketing("<<<><>>>>"),
                !s.correctBracketing("><<>"),
                !s.correctBracketing("<"),
                !s.correctBracketing("<<<<"),
                !s.correctBracketing(">"),
                !s.correctBracketing("<<>"),
                !s.correctBracketing("<><><<><>><>><<>"),
                !s.correctBracketing("<><><<><>><>>><>"));
        if (correct.contains(false)) {
            throw new AssertionError();
        }
        System.out.println("Task56: All tests passed.");
    }
}
