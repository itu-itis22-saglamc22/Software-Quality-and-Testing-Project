package task27;

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
    void emptyStringFlipCaseReturnsEmpty() {
        assertEquals("", solution.flipCase(""));
    }

    @Test
    void mixedCaseStringFlipsCorrectly() {
        assertEquals("hELLO!", solution.flipCase("Hello!"));
    }

    @Test
    void longMixedCaseSentenceFlipsCorrectly() {
        assertEquals(
            "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS",
            solution.flipCase("These violent delights have violent ends"));
    }
}
