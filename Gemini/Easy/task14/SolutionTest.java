package task14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;

class SolutionTest {

    @Test
    @DisplayName("Should return empty list for null or empty string")
    void testAllPrefixes_EmptyInputs() {
        Solution solution = new Solution();
        
        // Covers the 'string == null' and loop bypass for empty string
        assertAll("Empty Handling",
            () -> assertEquals(List.of(), solution.allPrefixes(""), "Empty string returns empty list"),
            () -> assertEquals(List.of(), solution.allPrefixes(null), "Null string returns empty list")
        );
    }

    @Test
    @DisplayName("Should generate all prefixes in correct order")
    void testAllPrefixes_Logic() {
        Solution solution = new Solution();
        
        // Standard case: ensures the loop runs from i=1 to i=length
        List<String> expected = Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh");
        assertEquals(expected, solution.allPrefixes("asdfgh"));

        // Case with identical characters
        List<String> expectedWWW = Arrays.asList("W", "WW", "WWW");
        assertEquals(expectedWWW, solution.allPrefixes("WWW"));
        
        // Single character case
        assertEquals(List.of("z"), solution.allPrefixes("z"));
    }
}
