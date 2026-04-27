package task33;

import java.util.ArrayList;
import java.util.List;
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
    void sortsValuesAtEveryThirdIndex() {
        assertEquals(
                List.of(2, 6, 3, 4, 8, 9, 5),
                solution.sortThird(new ArrayList<>(List.of(5, 6, 3, 4, 8, 9, 2))));
    }

    @Test
    void leavesNonThirdPositionsInOriginalOrder() {
        assertEquals(
                List.of(2, 8, 3, 4, 6, 9, 5),
                solution.sortThird(new ArrayList<>(List.of(5, 8, 3, 4, 6, 9, 2))));
    }

    @Test
    void sortsThirdPositionsWhenMiddleValuesDiffer() {
        assertEquals(
                List.of(2, 6, 9, 4, 8, 3, 5),
                solution.sortThird(new ArrayList<>(List.of(5, 6, 9, 4, 8, 3, 2))));
    }

    @Test
    void handlesTrailingNonThirdElement() {
        assertEquals(
                List.of(2, 6, 3, 4, 8, 9, 5, 1),
                solution.sortThird(new ArrayList<>(List.of(5, 6, 3, 4, 8, 9, 2, 1))));
    }
}
