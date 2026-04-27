import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void detectsCloseElementsWithinThreshold() {
        assertTrue(solution.hasCloseElements(new ArrayList<>(Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3));
    }

    @Test
    void rejectsElementsOutsideSmallThreshold() {
        assertFalse(solution.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05));
    }

    @Test
    void detectsCloseElementsNearOneUnitThreshold() {
        assertTrue(solution.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95));
    }

    @Test
    void rejectsPairWhenDifferenceExceedsThreshold() {
        assertFalse(solution.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8));
    }

    @Test
    void duplicateValuesAreCloseForPositiveThreshold() {
        assertTrue(solution.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1));
    }

    @Test
    void detectsCloseElementsWithThresholdOne() {
        assertTrue(solution.hasCloseElements(new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0));
    }

    @Test
    void rejectsSameValuesWithLowerThreshold() {
        assertFalse(solution.hasCloseElements(new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5));
    }
}
