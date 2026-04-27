package task115;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final int UNIT_CAPACITY = 1;
    private static final int TWO_UNIT_CAPACITY = 2;
    private static final int FIVE_UNIT_CAPACITY = 5;
    private static final int NINE_UNIT_CAPACITY = 9;
    private static final int SIX_REFILLS = 6;
    private static final int FIVE_REFILLS = 5;
    private static final int FOUR_REFILLS = 4;
    private static final int TWO_REFILLS = 2;
    private static final int NO_REFILLS = 0;

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void countsEachWaterUnitWhenCapacityIsOne() {
        List<List<Integer>> grid = List.of(
                List.of(0, 0, 1, 0),
                List.of(0, 1, 0, 0),
                List.of(1, 1, 1, 1));

        assertEquals(SIX_REFILLS, solution.maxFill(grid, UNIT_CAPACITY));
    }

    @Test
    void roundsUpPartiallyFilledRowsForCapacityTwo() {
        List<List<Integer>> grid = List.of(
                List.of(0, 0, 1, 1),
                List.of(0, 0, 0, 0),
                List.of(1, 1, 1, 1),
                List.of(0, 1, 1, 1));

        assertEquals(FIVE_REFILLS, solution.maxFill(grid, TWO_UNIT_CAPACITY));
    }

    @Test
    void emptyWaterCellsNeedNoRefills() {
        List<List<Integer>> grid = List.of(
                List.of(0, 0, 0),
                List.of(0, 0, 0));

        assertEquals(NO_REFILLS, solution.maxFill(grid, FIVE_UNIT_CAPACITY));
    }

    @Test
    void fullRowsUseTwoRefillsEachWhenCapacityIsTwo() {
        List<List<Integer>> grid = List.of(
                List.of(1, 1, 1, 1),
                List.of(1, 1, 1, 1));

        assertEquals(FOUR_REFILLS, solution.maxFill(grid, TWO_UNIT_CAPACITY));
    }

    @Test
    void capacityLargerThanRowStillRequiresOneRefillPerNonEmptyRow() {
        List<List<Integer>> grid = List.of(
                List.of(1, 1, 1, 1),
                List.of(1, 1, 1, 1));

        assertEquals(TWO_REFILLS, solution.maxFill(grid, NINE_UNIT_CAPACITY));
    }
}
