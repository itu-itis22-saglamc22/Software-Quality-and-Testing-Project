package task11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @Test
    @DisplayName("Should handle edge cases (null and empty strings)")
    void testMakePalindrome_EdgeCases() {
        Solution solution = new Solution();
        
        // Bu iki test 'if (string == null || string.isEmpty())' dalını kapsar
        assertAll("Edge Cases",
            () -> assertEquals("", solution.makePalindrome(""), "Empty string should return empty"),
            () -> assertEquals("", solution.makePalindrome(null), "Null should return empty")
        );
    }

    @Test
    @DisplayName("Should create shortest palindrome for various inputs")
    void testMakePalindrome_Logic() {
        Solution solution = new Solution();
        
        assertAll("Palindrome Logic",
            () -> assertEquals("x", solution.makePalindrome("x")),
            () -> assertEquals("xyzyx", solution.makePalindrome("xyz")),
            () -> assertEquals("xyx", solution.makePalindrome("xyx")),
            () -> assertEquals("jerryrrej", solution.makePalindrome("jerry")),
            () -> assertEquals("catac", solution.makePalindrome("cat"))
        );
    }
}
