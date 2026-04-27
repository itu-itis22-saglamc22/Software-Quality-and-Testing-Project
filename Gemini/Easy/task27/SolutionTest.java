package task27;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @Test
    @DisplayName("Should flip cases correctly for mixed strings")
    void testFlipCase_Logic() {
        Solution solution = new Solution();
        
        assertAll("Case Flipping",
            () -> assertEquals("hELLO!", solution.flipCase("Hello!"), 
                "Should flip letters and ignore punctuation"),
            () -> assertEquals("aBC", solution.flipCase("Abc"), 
                "Should handle simple mixed case"),
            () -> assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", 
                solution.flipCase("These violent delights have violent ends"), 
                "Should handle long sentences with spaces")
        );
    }

    @Test
    @DisplayName("Should handle edge cases like empty, null, or non-alpha strings")
    void testFlipCase_EdgeCases() {
        Solution solution = new Solution();
        
        assertAll("Edge Cases",
            () -> assertEquals("", solution.flipCase(""), "Empty string should return empty"),
            () -> assertEquals("", solution.flipCase(null), "Null string should return empty"),
            () -> assertEquals("123!@#", solution.flipCase("123!@#"), "Numeric/Symbol strings should remain unchanged")
        );
    }
}
