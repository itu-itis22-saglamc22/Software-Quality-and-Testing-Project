package task27;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.flipCase(""), ""),
                Objects.equals(s.flipCase("Hello!"), "hELLO!"),
                Objects.equals(s.flipCase("These violent delights have violent ends"),
                        "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"));

        if (correct.contains(false)) {
            int failedIndex = correct.indexOf(false);
            throw new AssertionError("Test case at index " + failedIndex + " failed!");
        } else {
            System.out.println("Task 27: All tests passed successfully!");
        }
    }
}