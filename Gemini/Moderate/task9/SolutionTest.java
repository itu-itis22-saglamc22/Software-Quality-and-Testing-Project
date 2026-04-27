package task9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty or null lists")
    void testBoundaryConditions() {
        // Ensures the loop is bypassed and an empty list is returned safely
        assertEquals(new ArrayList<>(), solution.rollingMax(new ArrayList<>()));
        
        // Uncomment if Solution.java handles null natively
        // assertEquals(new ArrayList<>(), solution.rollingMax(null));
    }

    @Test
    @DisplayName("Logic Path: Monotonic Increasing (Constant Max Updates)")
    void testIncreasingSequence() {
        // Every element is larger than the previous, triggering the update branch every time
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, solution.rollingMax(new ArrayList<>(input)));
    }

    @Test
    @DisplayName("Logic Path: Monotonic Decreasing (No Max Updates after first)")
    void testDecreasingSequence() {
        // After the first element (4), all subsequent elements are smaller.
        // Triggers the False path of the max update branch.
        List<Integer> input = Arrays.asList(4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(4, 4, 4, 4);
        assertEquals(expected, solution.rollingMax(new ArrayList<>(input)));
    }

    @Test
    @DisplayName("Logic Path: Fluctuating Sequence (Mixed Update/Retain branches)")
    void testFluctuatingSequence() {
        // Tests the ability to maintain max through valleys and update at new peaks
        List<Integer> input = Arrays.asList(3, 2, 3, 100, 3);
        List<Integer> expected = Arrays.asList(3, 3, 3, 100, 100);
        assertEquals(expected, solution.rollingMax(new ArrayList<>(input)));

        List<Integer> complexInput = Arrays.asList(1, 2, 3, 2, 3, 4, 2);
        List<Integer> complexExpected = Arrays.asList(1, 2, 3, 3, 3, 4, 4);
        assertEquals(complexExpected, solution.rollingMax(new ArrayList<>(complexInput)));
    }
}
