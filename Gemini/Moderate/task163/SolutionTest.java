package task163;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Logic Path: Standard Ordered Boundaries (a <= b)")
    void testStandardRange() {
        // Triggers the base path without needing to swap boundaries.
        // Expects: 2, 4, 6, 8
        assertEquals(Arrays.asList(2, 4, 6, 8), solution.generateIntegers(2, 10));
    }

    @Test
    @DisplayName("Logic Path: Swapped Boundaries (a > b)")
    void testSwappedBoundaries() {
        // Triggers the swapping branch (finding Math.min and Math.max)
        assertEquals(Arrays.asList(2, 4, 6, 8), solution.generateIntegers(10, 2));
        
        // Large upper bound flipped
        assertEquals(Arrays.asList(2, 4, 6, 8), solution.generateIntegers(132, 2));
    }

    @Test
    @DisplayName("Logic Path: Exact Match Boundaries")
    void testExactBoundaries() {
        // Ensures the loop conditions are strictly inclusive (e.g., i <= max, not i < max)
        assertEquals(Arrays.asList(2, 4, 6, 8), solution.generateIntegers(2, 8));
        assertEquals(Arrays.asList(2, 4, 6, 8), solution.generateIntegers(8, 2));
    }

    @Test
    @DisplayName("Logic Path: Ranges with NO single-digit even numbers")
    void testOutofBoundsRanges() {
        // Triggers the False paths of the even/single-digit validation branch.
        // Range starts above 9
        assertEquals(new ArrayList<>(), solution.generateIntegers(10, 14));
        
        // Completely disconnected high range
        assertEquals(new ArrayList<>(), solution.generateIntegers(17, 89));
    }
}
