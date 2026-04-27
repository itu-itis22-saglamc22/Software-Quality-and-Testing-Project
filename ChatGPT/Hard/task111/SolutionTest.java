package task111;

import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final int SINGLE_OCCURRENCE = 1;
    private static final int TIED_MAX_COUNT = 2;
    private static final int DOMINANT_B_COUNT = 4;

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void returnsAllTokensTiedForHighestCount() {
        assertEquals(Map.of("a", TIED_MAX_COUNT, "b", TIED_MAX_COUNT), solution.histogram("a b b a"));
    }

    @Test
    void omitsTokensBelowHighestCount() {
        assertEquals(Map.of("a", TIED_MAX_COUNT, "b", TIED_MAX_COUNT), solution.histogram("a b c a b"));
    }

    @Test
    void returnsEveryTokenWhenAllCountsAreTied() {
        assertEquals(
                Map.of(
                        "a", SINGLE_OCCURRENCE,
                        "b", SINGLE_OCCURRENCE,
                        "c", SINGLE_OCCURRENCE,
                        "d", SINGLE_OCCURRENCE,
                        "g", SINGLE_OCCURRENCE),
                solution.histogram("a b c d g"));
    }

    @Test
    void returnsSingleOccurrenceWordsForShortInput() {
        assertEquals(
                Map.of("r", SINGLE_OCCURRENCE, "t", SINGLE_OCCURRENCE, "g", SINGLE_OCCURRENCE),
                solution.histogram("r t g"));
    }

    @Test
    void returnsOnlyDominantTokenWhenOneTokenHasHighestCount() {
        assertEquals(Map.of("b", DOMINANT_B_COUNT), solution.histogram("b b b b a"));
    }

    @Test
    void emptyInputReturnsEmptyHistogram() {
        assertEquals(Map.of(), solution.histogram(""));
    }

    @Test
    void singleTokenInputReturnsThatToken() {
        assertEquals(Map.of("a", SINGLE_OCCURRENCE), solution.histogram("a"));
    }
}
