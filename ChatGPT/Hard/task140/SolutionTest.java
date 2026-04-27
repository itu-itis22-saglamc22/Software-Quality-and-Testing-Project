package task140;

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
    void textWithoutSpacesIsUnchanged() {
        assertEquals("Example", solution.fixSpaces("Example"));
    }

    @Test
    void singleSpacesBecomeUnderscoresIncludingTrailingSpace() {
        assertEquals("Mudasir_Hanif_", solution.fixSpaces("Mudasir Hanif "));
    }

    @Test
    void doubleSpacesBecomeDoubleUnderscores() {
        assertEquals("Yellow_Yellow__Dirty__Fellow", solution.fixSpaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    void threeConsecutiveSpacesBecomeHyphen() {
        assertEquals("Exa-mple", solution.fixSpaces("Exa   mple"));
    }

    @Test
    void leadingRunAndSingleSpacesUseTheirOwnReplacementRules() {
        assertEquals("-Exa_1_2_2_mple", solution.fixSpaces("   Exa 1 2 2 mple"));
    }
}
