package task18;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @Test
    @DisplayName("Should handle empty or null inputs correctly")
    void testHowManyTimes_EdgeCases() {
        Solution solution = new Solution();
        
        assertAll("Edge Cases",
            () -> assertEquals(0, solution.howManyTimes("", "x"), "Empty string should return 0"),
            () -> assertEquals(0, solution.howManyTimes(null, "x"), "Null string should return 0"),
            () -> assertEquals(0, solution.howManyTimes("abc", ""), "Empty substring should return 0")
        );
    }

    @Test
    @DisplayName("Should count overlapping and non-overlapping occurrences")
    void testHowManyTimes_Logic() {
        Solution solution = new Solution();
        
        // Overlapping case: "xyxyxyx" contains "x" at indices 0, 2, 4, 6
        assertEquals(4, solution.howManyTimes("xyxyxyx", "x"));
        
        // Complex overlap: "cacacacac" contains "cac" starting at indices 0, 2, 4, 6
        assertEquals(4, solution.howManyTimes("cacacacac", "cac"));
        
        // Standard non-overlapping case
        assertEquals(1, solution.howManyTimes("john doe", "john"));
        
        // Substring longer than string
        assertEquals(0, solution.howManyTimes("hi", "hello"));
    }
}
