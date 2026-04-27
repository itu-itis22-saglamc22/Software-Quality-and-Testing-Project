package task1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for null and empty inputs")
    void testBoundaryConditions() {
        // Ensures the defensive programming guards (if text == null) are covered
        assertAll("Boundary Conditions",
            () -> assertEquals(new ArrayList<>(), solution.separateParenGroups("")),
            () -> assertEquals(new ArrayList<>(), solution.separateParenGroups(null), "Null should return an empty list")
        );
    }

    @Test
    @DisplayName("Logic Path: Process sequential and isolated groups")
    void testSequentialGroups() {
        // Triggers standard balance tracking (0 to 1 to 0) multiple times
        List<String> expected = Arrays.asList("()", "(())", "((()))", "(((())))");
        assertEquals(expected, solution.separateParenGroups("() (()) ((())) (((())))"));
    }

    @Test
    @DisplayName("Logic Path: Process deep nesting and complex structures")
    void testNestedGroups() {
        // Triggers deep balance tracking and resets
        List<String> expectedMultiple = Arrays.asList("(()())", "((()))", "()", "((())()())");
        assertEquals(expectedMultiple, solution.separateParenGroups("(()()) ((())) () ((())()())"));

        // Single giant nested group
        List<String> expectedSingle = Arrays.asList("(()(())((())))");
        assertEquals(expectedSingle, solution.separateParenGroups("(()(())((())))"));
    }

    @Test
    @DisplayName("Logic Path: Ignore and filter whitespace characters")
    void testSpaceRemovalLogic() {
        // Specifically targets the 'if (char == ' ')' ignore branch
        List<String> expected = Arrays.asList("()", "(())", "(()())");
        assertEquals(expected, solution.separateParenGroups("( ) (( )) (( )( ))"));
    }
}
