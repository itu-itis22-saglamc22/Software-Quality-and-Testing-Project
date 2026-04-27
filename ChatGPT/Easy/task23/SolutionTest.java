package task23;

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
    void emptyStringHasLengthZero() {
        assertEquals(0, solution.strlen(""));
    }

    @Test
    void singleCharStringHasLengthOne() {
        assertEquals(1, solution.strlen("x"));
    }

    @Test
    void multiCharStringHasCorrectLength() {
        assertEquals(9, solution.strlen("asdasnakj"));
    }
}
