package task37;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void leavesAlreadySortedEvenIndexesUnchanged() {
        assertEquals(List.of(1, 2, 3), solution.sortEven(new ArrayList<>(List.of(1, 2, 3))));
    }

    @Test
    void sortsEvenIndexesAcrossPositiveAndNegativeValues() {
        assertEquals(
                List.of(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123),
                solution.sortEven(new ArrayList<>(List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))));
    }

    @Test
    void keepsOddIndexesFixedWhileSortingEvenIndexes() {
        assertEquals(
                List.of(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10),
                solution.sortEven(new ArrayList<>(List.of(5, 8, -12, 4, 23, 2, 3, 11, 12, -10))));
    }
}
