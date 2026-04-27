package task0;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testNullInput() {
        assertFalse(solution.hasCloseElements(null, 1.0));
    }

    @Test
    void testEmptyList() {
        assertFalse(solution.hasCloseElements(new ArrayList<>(), 1.0));
    }

    @Test
    void testSingleElementList() {
        assertFalse(solution.hasCloseElements(List.of(5.0), 1.0));
    }

    @Test
    void testCloseElementsExists() {
        assertTrue(solution.hasCloseElements(
                Arrays.asList(1.0, 2.0, 2.1), 0.2));
    }

    @Test
    void testNoCloseElements() {
        assertFalse(solution.hasCloseElements(
                Arrays.asList(1.0, 2.0, 3.0), 0.5));
    }

    @Test
    void testBoundaryEqualThreshold() {
        // distance == threshold → should be false
        assertFalse(solution.hasCloseElements(
                Arrays.asList(1.0, 1.3), 0.3));
    }

    @Test
    void testMultiplePairsOneValid() {
        assertTrue(solution.hasCloseElements(
                Arrays.asList(10.0, 5.0, 5.1, 20.0), 0.2));
    }
}
