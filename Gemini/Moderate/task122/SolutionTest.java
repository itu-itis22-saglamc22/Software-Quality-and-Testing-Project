package task122;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty lists or k=0")
    void testBoundaryConditions() {
        // Ensures empty lists or 0 iterations return 0 safely
        assertEquals(0, solution.addElements(new ArrayList<>(), 5));
        assertEquals(0, solution.addElements(Arrays.asList(10, 20), 0));
    }

    @Test
    @DisplayName("Logic Path: Elements with at most two digits are summed (True Path)")
    void testIncludedElements() {
        // Includes positive and negative numbers with 1 or 2 digits
        // Sums first 3: 1 + (-2) + (-3) = -4
        assertEquals(-4, solution.addElements(Arrays.asList(1, -2, -3, 41, 57), 3));
        
        // Single element test
        assertEquals(1, solution.addElements(Arrays.asList(1), 1));
    }

    @Test
    @DisplayName("Logic Path: Elements with > 2 digits are ignored (False Path)")
    void testIgnoredElements() {
        // 111 and 121 both have 3 digits, so they are bypassed. Sum = 0.
        assertEquals(0, solution.addElements(Arrays.asList(111, 121, 3, 4000), 2));
    }

    @Test
    @DisplayName("Logic Path: Both constraints active (Mixed digits and strict k boundary)")
    void testMixedElementsAndKBoundary() {
        // First 4 elements: 11, 21, 3, 90. All <= 2 digits. Sum = 125.
        // The 5, 6, 7 are ignored because they are beyond k=4.
        assertEquals(125, solution.addElements(Arrays.asList(11, 21, 3, 90, 5, 6, 7), 4));
        
        // First 4 elements: 111 (ignored), 21 (sum), 3 (sum), 4000 (ignored). Sum = 24.
        assertEquals(24, solution.addElements(Arrays.asList(111, 21, 3, 4000, 5, 6), 4));
    }
}
