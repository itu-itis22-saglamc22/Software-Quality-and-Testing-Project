package task131;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testDigits() {
        Solution s = new Solution();

        assertEquals(5, s.digits(5));
        assertEquals(5, s.digits(54));
        assertEquals(1, s.digits(120));
        assertEquals(5, s.digits(5014));
        assertEquals(315, s.digits(98765));
        assertEquals(2625, s.digits(5576543));
    }
}
