package task140;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for null and empty strings")
    void testBoundaryConditions() {
        // Covers early return branches / Null-Safety
        // If your Solution.java throws an exception on null instead of returning "",
        // you can comment out the null check, but defensive programming is best!
        assertAll("Boundary Guard Tests",
                () -> assertEquals("", solution.fixSpaces("")),
                () -> assertEquals("", solution.fixSpaces(null),
                        "Null should be handled safely, returning an empty string."));
    }

    @Test
    @DisplayName("Logic Path: No spaces present (Bypass mutation)")
    void testNoSpaces() {
        // Covers the standard loop bypass / no-match branch
        assertEquals("Example", solution.fixSpaces("Example"));
    }

    @Test
    @DisplayName("Logic Path: Single and double spaces become underscores")
    void testUnderScoreReplacements() {
        // Covers the 1 and 2 space count branches
        assertEquals("Mudasir_Hanif_", solution.fixSpaces("Mudasir Hanif "));
        assertEquals("Yellow_Yellow__Dirty__Fellow", solution.fixSpaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    @DisplayName("Logic Path: 3 or more spaces become a single dash")
    void testDashReplacements() {
        // Covers the > 2 space count branches, including leading space scenarios
        assertEquals("Exa-mple", solution.fixSpaces("Exa   mple"));
        assertEquals("-Exa_1_2_2_mple", solution.fixSpaces("   Exa 1 2 2 mple"));
        assertEquals("_Example-3", solution.fixSpaces(" Example   3"));
    }

    @Test
    @DisplayName("Logic Path: Flush accumulator for trailing spaces")
    void testTrailingSpaces() {
        // Specifically forces the end-of-string state flush if the solution uses an
        // iterative loop
        assertEquals("End-", solution.fixSpaces("End   "), "Failed to flush 3 trailing spaces");
        assertEquals("End__", solution.fixSpaces("End  "), "Failed to flush 2 trailing spaces");
    }
}
