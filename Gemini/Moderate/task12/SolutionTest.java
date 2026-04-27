package task12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for null and empty lists")
    void testBoundaryConditions() {
        // Ensures the early-return branches are covered and prevents crashes
        assertAll("Boundary Guard Tests",
            () -> assertTrue(solution.longest(new ArrayList<>()).isEmpty(), "Empty list should return Optional.empty()"),
            () -> assertTrue(solution.longest(null).isEmpty(), "Null list should be handled safely, returning Optional.empty()")
        );
    }

    @Test
    @DisplayName("Logic Path: List with a clear, unique maximum length")
    void testUniqueMaximum() {
        // Triggers the True path of the 'current > max' replacement branch
        assertEquals("ccc", solution.longest(Arrays.asList("a", "bb", "ccc")).get());
    }

    @Test
    @DisplayName("Logic Path: Tie-breaking logic (First occurrence wins)")
    void testTieBreaking() {
        // Triggers the False path of the 'current > max' replacement branch
        
        // "zzzz" and "kkkk" both have length 4. "zzzz" comes first and must be retained.
        assertEquals("zzzz", solution.longest(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc")).get());
        
        // All elements have length 1. The first element ("x") must be retained.
        assertEquals("x", solution.longest(Arrays.asList("x", "y", "z")).get());
    }
}
