package task18;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyStringContainsSubstringZeroTimes() {
        assertEquals(0, solution.howManyTimes("", "x"));
    }

    @Test
    void singleCharSubstringCountedCorrectly() {
        assertEquals(4, solution.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    void overlappingSubstringCountedCorrectly() {
        assertEquals(4, solution.howManyTimes("cacacacac", "cac"));
    }

    @Test
    void nonOverlappingSubstringCountedOnce() {
        assertEquals(1, solution.howManyTimes("john doe", "john"));
    }
}
