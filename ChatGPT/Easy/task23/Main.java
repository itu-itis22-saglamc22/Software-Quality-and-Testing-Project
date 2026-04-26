package task23;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.strlen("") == 0,
                s.strlen("x") == 1,
                s.strlen("asdasnakj") == 9);
        if (correct.contains(false)) {
            throw new AssertionError();
        }
        System.out.println("Task23: All tests passed.");
    }
}