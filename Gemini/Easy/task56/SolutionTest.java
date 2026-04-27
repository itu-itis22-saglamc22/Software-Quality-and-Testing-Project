package task56;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @Test
    @DisplayName("Should return true for balanced brackets")
    void testCorrectBracketing_Balanced() {
        Solution solution = new Solution();
        
        assertAll("Balanced Scenarios",
            () -> assertTrue(solution.correctBracketing("<>")),
            () -> assertTrue(solution.correctBracketing("<<><>>")),
            () -> assertTrue(solution.correctBracketing("<><><<><>><>"))
        );
    }

    @Test
    @DisplayName("Should return false for unbalanced or invalid sequences")
    void testCorrectBracketing_Unbalanced() {
        Solution solution = new Solution();
        
        assertAll("Unbalanced Scenarios",
            // Case 1: Early exit (negative balance)
            () -> assertFalse(solution.correctBracketing("><<>"), "Starts with closing bracket"),
            () -> assertFalse(solution.correctBracketing("<>>"), "Too many closing brackets"),
            
            // Case 2: Final balance > 0
            () -> assertFalse(solution.correctBracketing("<<<<"), "Only opening brackets"),
            () -> assertFalse(solution.correctBracketing("<<>"), "Unclosed opening bracket"),
            
            // Case 3: Single characters
            () -> assertFalse(solution.correctBracketing("<")),
            () -> assertFalse(solution.correctBracketing(">"))
        );
    }

    @Test
    @DisplayName("Should handle edge cases like empty or null strings")
    void testCorrectBracketing_EdgeCases() {
        Solution solution = new Solution();
        
        // Jacoco often marks null/empty checks as separate branches
        assertAll("Edge Cases",
            () -> assertTrue(solution.correctBracketing(""), "Empty string is technically balanced"),
            () -> assertFalse(solution.correctBracketing(null), "Null should return false")
        );
    }
}
