package task131;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @Test
    @DisplayName("Should calculate product of odd digits correctly")
    void testDigits_Logic() {
        Solution solution = new Solution();
        
        // Tests mix of odd and even digits
        assertAll("Regular Inputs",
            () -> assertEquals(5, solution.digits(5)),
            () -> assertEquals(5, solution.digits(54)),
            () -> assertEquals(1, solution.digits(120)),
            () -> assertEquals(5, solution.digits(5014)),
            () -> assertEquals(315, solution.digits(98765)), // 9 * 7 * 5 = 315
            () -> assertEquals(2625, solution.digits(5576543)) // 5 * 5 * 7 * 5 * 3 = 2625
        );
    }

    @Test
    @DisplayName("Should handle numbers with no odd digits")
    void testDigits_NoOddDigits() {
        Solution solution = new Solution();
        
        // This ensures the branch where 'product' is never updated is covered
        assertEquals(0, solution.digits(2468), "Should return 0 if no odd digits exist");
        assertEquals(0, solution.digits(0), "Should return 0 for input 0");
    }
}
