package task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyStringRemainsEmpty() {
        assertEquals("", solution.makePalindrome(""));
    }

    @Test
    void singleCharacterIsAlreadyPalindrome() {
        assertEquals("x", solution.makePalindrome("x"));
    }

    @Test
    void appendsReversePrefixForNonPalindrome() {
        assertEquals("xyzyx", solution.makePalindrome("xyz"));
    }

    @Test
    void existingPalindromeIsUnchanged() {
        assertEquals("xyx", solution.makePalindrome("xyx"));
    }

    @Test
    void appendsOnlyNeededPrefixForWordWithPalindromicSuffix() {
        assertEquals("jerryrrej", solution.makePalindrome("jerry"));
    }
}
