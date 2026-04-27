package task13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testGreatestCommonDivisorProvidedCases() {
        Solution s = new Solution();

        assertEquals(1, s.greatestCommonDivisor(3, 7));
        assertEquals(5, s.greatestCommonDivisor(10, 15));
        assertEquals(7, s.greatestCommonDivisor(49, 14));
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }

    @Test
    void testFirstNumberZero() {
        Solution s = new Solution();

        assertEquals(7, s.greatestCommonDivisor(0, 7));
    }

    @Test
    void testSecondNumberZero() {
        Solution s = new Solution();

        assertEquals(9, s.greatestCommonDivisor(9, 0));
    }

    @Test
    void testBothNumbersEqual() {
        Solution s = new Solution();

        assertEquals(6, s.greatestCommonDivisor(6, 6));
    }

    @Test
    void testFirstGreaterThanSecond() {
        Solution s = new Solution();

        assertEquals(4, s.greatestCommonDivisor(20, 8));
    }

    @Test
    void testSecondGreaterThanFirst() {
        Solution s = new Solution();

        assertEquals(3, s.greatestCommonDivisor(6, 21));
    }
}
