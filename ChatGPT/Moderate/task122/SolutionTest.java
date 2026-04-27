package task122;

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
    void sumsNegativeAndPositiveTwoDigitValuesWithinPrefix() {
        assertEquals(-4, solution.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
    }

    @Test
    void ignoresThreeDigitValuesInPrefix() {
        assertEquals(0, solution.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
    }

    @Test
    void sumsAllTwoDigitAndOneDigitValuesInPrefix() {
        assertEquals(125, solution.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
    }

    @Test
    void skipsLargeValuesWhileKeepingValidPrefixValues() {
        assertEquals(24, solution.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
    }

    @Test
    void singleElementPrefixIsSummed() {
        assertEquals(1, solution.addElements(List.of(1), 1));
    }
}
