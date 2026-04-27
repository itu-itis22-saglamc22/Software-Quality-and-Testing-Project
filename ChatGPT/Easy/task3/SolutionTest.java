package task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyOperationsNeverGoesBelowZero() {
        assertFalse(solution.belowZero(new ArrayList<>(Arrays.asList())));
    }

    @Test
    void balancedOperationsNeverGoesBelowZero() {
        assertFalse(solution.belowZero(new ArrayList<>(Arrays.asList(1, 2, -3, 1, 2, -3))));
    }

    @Test
    void largeNegativeDropGoesBelowZero() {
        assertTrue(solution.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5, 6))));
    }

    @Test
    void perfectlyCancellingOperationsNeverGoesBelowZero() {
        assertFalse(solution.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4))));
    }

    @Test
    void offByOneFinalDropGoesBelowZero() {
        assertTrue(solution.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5))));
    }

    @Test
    void earlyOverdraftGoesBelowZero() {
        assertTrue(solution.belowZero(new ArrayList<>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4))));
    }
}
