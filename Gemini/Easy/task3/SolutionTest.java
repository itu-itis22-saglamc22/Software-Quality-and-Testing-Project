package task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    private static final double EPSILON = 1e-6;

    @Test
    @DisplayName("Should return the fractional part of positive numbers")
    void testTruncateNumber_PositiveValues() {
        Solution solution = new Solution();
        
        assertAll("Fractional Parts",
            () -> assertEquals(0.5, solution.truncateNumber(3.5), EPSILON),
            () -> assertEquals(0.33, solution.truncateNumber(1.33), EPSILON),
            () -> assertEquals(0.456, solution.truncateNumber(123.456), EPSILON),
            () -> assertEquals(0.123, solution.truncateNumber(0.123), EPSILON)
        );
    }

    @Test
    @DisplayName("Should return 0.0 for whole numbers")
    void testTruncateNumber_WholeNumbers() {
        Solution solution = new Solution();
        
        // This covers the branch where number % 1.0 == 0
        assertEquals(0.0, solution.truncateNumber(10.0), EPSILON, "Whole numbers should result in 0.0");
        assertEquals(0.0, solution.truncateNumber(0.0), EPSILON, "Input 0.0 should result in 0.0");
    }
}
