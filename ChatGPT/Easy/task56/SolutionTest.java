package task56;

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
    void singlePairIsCorrect() {
        assertTrue(solution.correctBracketing("<>"));
    }

    @Test
    void nestedPairsAreCorrect() {
        assertTrue(solution.correctBracketing("<<><>>"));
    }

    @Test
    void sequenceOfNestedPairsIsCorrect() {
        assertTrue(solution.correctBracketing("<><><<><>><>"));
    }

    @Test
    void complexValidSequenceIsCorrect() {
        assertTrue(solution.correctBracketing("<><><<<><><>><>><<><><<>>>"));
    }

    @Test
    void extraClosingBracketMakesIncorrect() {
        assertFalse(solution.correctBracketing("<<<><>>>>"));
    }

    @Test
    void leadingClosingBracketMakesIncorrect() {
        assertFalse(solution.correctBracketing("><<>"));
    }

    @Test
    void singleOpeningBracketIsIncorrect() {
        assertFalse(solution.correctBracketing("<"));
    }

    @Test
    void onlyOpeningBracketsAreIncorrect() {
        assertFalse(solution.correctBracketing("<<<<"));
    }

    @Test
    void singleClosingBracketIsIncorrect() {
        assertFalse(solution.correctBracketing(">"));
    }

    @Test
    void unclosedOpeningBracketIsIncorrect() {
        assertFalse(solution.correctBracketing("<<>"));
    }

    @Test
    void unbalancedSequenceWithExtraOpenIsIncorrect() {
        assertFalse(solution.correctBracketing("<><><<><>><>><<>"));
    }

    @Test
    void unbalancedSequenceWithExtraCloseIsIncorrect() {
        assertFalse(solution.correctBracketing("<><><<><>><>>><>"));
    }
}
