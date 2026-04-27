package task131;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testDigits() {
        Solution s = new Solution();

        // normal cases
        assertEquals(5, s.digits(5));
        assertEquals(5, s.digits(54));
        assertEquals(1, s.digits(120));
        assertEquals(5, s.digits(5014));
        assertEquals(315, s.digits(98765));
        assertEquals(2625, s.digits(5576543));

        // branch: no odd digits -> oddCount == 0
        assertEquals(0, s.digits(2));
        assertEquals(0, s.digits(2468));

        // branch: multiple odds with multiplication path
        assertEquals(9, s.digits(33)); // 3 * 3

        // edge: zero input (while loop never runs)
        assertEquals(0, s.digits(0));
    }
}

