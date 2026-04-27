package task6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty or whitespace-only inputs")
    void testBoundaryConditions() {
        // Ensures the algorithm safely handles empty inputs (Returns empty list)
        assertEquals(new ArrayList<>(), solution.parseNestedParens(""));
        assertEquals(new ArrayList<>(), solution.parseNestedParens("   "));
        
        // Uncomment the line below if Solution.java includes defensive null checking
        // assertEquals(new ArrayList<>(), solution.parseNestedParens(null));
    }

    @Test
    @DisplayName("Logic Path: Handle consecutive spaces (Empty token filtering)")
    void testExtraSpaces() {
        // Triggers the 'if (token.isEmpty()) continue' branch during string split
        // "()" has depth 1, "(())" has depth 2
        assertEquals(Arrays.asList(1, 2), solution.parseNestedParens("  ()   (())  "));
    }

    @Test
    @DisplayName("Logic Path: Strictly nested depths")
    void testStrictlyNested() {
        // Triggers continuous updates to the maxDepth tracker
        assertEquals(Arrays.asList(1), solution.parseNestedParens("()"));
        assertEquals(Arrays.asList(3), solution.parseNestedParens("((()))"));
        assertEquals(Arrays.asList(4), solution.parseNestedParens("(((())))"));
    }

    @Test
    @DisplayName("Logic Path: Sequential depths within a single group")
    void testSequentialDepths() {
        // Triggers paths where currentDepth decreases, but maxDepth remains high
        // "(()())" reaches max depth 2, goes down to 1, back to 2, down to 0.
        assertEquals(Arrays.asList(2), solution.parseNestedParens("(()())"));
    }

    @Test
    @DisplayName("Integration Path: Complex mixed groups")
    void testOriginalComplexCase() {
        // The original assignment test case validating the full integration
        assertEquals(
            Arrays.asList(2, 3, 1, 3), 
            solution.parseNestedParens("(()()) ((())) () ((())()())")
        );
    }
}
