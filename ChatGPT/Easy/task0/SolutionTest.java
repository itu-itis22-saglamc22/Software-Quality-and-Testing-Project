package task0;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void nullInputReturnsFalse() {
        assertFalse(solution.hasCloseElements(null, 1.0));
    }

    @Test
    void emptyListReturnsFalse() {
        assertFalse(solution.hasCloseElements(new ArrayList<>(), 1.0));
    }

    @Test
    void singleElementListReturnsFalse() {
        assertFalse(solution.hasCloseElements(List.of(5.0), 1.0));
    }

    @Test
    void closeElementsExistReturnTrue() {
        assertTrue(solution.hasCloseElements(Arrays.asList(1.0, 2.0, 2.1), 0.2));
    }

    @Test
    void noCloseElementsReturnFalse() {
        assertFalse(solution.hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5));
    }

    @Test
    void distanceEqualToThresholdReturnsFalse() {
        // distance == threshold → strict less-than check, not equal
        assertFalse(solution.hasCloseElements(Arrays.asList(1.0, 1.3), 0.3));
    }

    @Test
    void multiplePairsOneValidReturnTrue() {
        assertTrue(solution.hasCloseElements(Arrays.asList(10.0, 5.0, 5.1, 20.0), 0.2));
    }
}
