package task13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testGreatestCommonDivisor() {
        Solution s = new Solution();

        assertEquals(1, s.greatestCommonDivisor(3, 7));
        assertEquals(5, s.greatestCommonDivisor(10, 15));
        assertEquals(7, s.greatestCommonDivisor(49, 14));
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }
}
