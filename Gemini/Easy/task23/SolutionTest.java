package task23;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @Test
    @DisplayName("Should return correct string length for various inputs")
    void testStrlen_Logic() {
        Solution solution = new Solution();
        
        assertAll("String Lengths",
            () -> assertEquals(0, solution.strlen(""), "Empty string should have length 0"),
            () -> assertEquals(1, solution.strlen("x"), "Single character should have length 1"),
            () -> assertEquals(9, solution.strlen("asdasnakj"), "Multi-character string should have length 9"),
            () -> assertEquals(5, solution.strlen("Hello"), "Standard word length check")
        );
    }

    @Test
    @DisplayName("Should handle null input gracefully")
    void testStrlen_NullInput() {
        Solution solution = new Solution();
        
        // This test ensures the null-check branch is fully covered
        assertEquals(0, solution.strlen(null), "Null input should return length 0");
    }
}
