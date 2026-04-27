package task12;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyListReturnsEmptyOptional() {
        assertTrue(solution.longest(new ArrayList<>()).isEmpty());
    }

    @Test
    void firstStringWinsWhenAllLengthsAreEqual() {
        assertEquals("x", solution.longest(new ArrayList<>(List.of("x", "y", "z"))).orElseThrow());
    }

    @Test
    void longestStringIsReturned() {
        assertEquals(
                "zzzz",
                solution.longest(new ArrayList<>(List.of("x", "yyy", "zzzz", "www", "kkkk", "abc"))).orElseThrow());
    }
}
