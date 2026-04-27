package task13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;

class SolutionTest {

    @Test
    @DisplayName("Should return empty Optional for null or empty input")
    void testLongest_EmptyInputs() {
        Solution solution = new Solution();
        
        assertAll("Empty Checks",
            () -> assertTrue(solution.longest(null).isEmpty(), "Null input should return empty"),
            () -> assertTrue(solution.longest(new ArrayList<>()).isEmpty(), "Empty list should return empty")
        );
    }

    @Test
    @DisplayName("Should find the longest string and handle ties correctly")
    void testLongest_Logic() {
        Solution solution = new Solution();

        List<String> list1 = Arrays.asList("a", "bb", "ccc");
        assertEquals("ccc", solution.longest(list1).get());

        List<String> list2 = Arrays.asList("apple", "peach", "grape");
        assertEquals("apple", solution.longest(list2).get(), "Should return the first longest string in case of a tie");
        
        List<String> list3 = Arrays.asList("x", "yyy", "zzzz", "www", "kkkk");
        assertEquals("zzzz", solution.longest(list3).get());
    }
}
