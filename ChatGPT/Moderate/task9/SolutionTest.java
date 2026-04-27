package task9;

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
    void emptyListReturnsEmptyRollingMaximums() {
        assertEquals(List.of(), solution.rollingMax(new ArrayList<>()));
    }

    @Test
    void increasingValuesAreTheirOwnRollingMaximums() {
        assertEquals(List.of(1, 2, 3, 4), solution.rollingMax(new ArrayList<>(List.of(1, 2, 3, 4))));
    }

    @Test
    void decreasingValuesKeepFirstValueAsRollingMaximum() {
        assertEquals(List.of(4, 4, 4, 4), solution.rollingMax(new ArrayList<>(List.of(4, 3, 2, 1))));
    }

    @Test
    void laterPeakBecomesNewRollingMaximum() {
        assertEquals(List.of(3, 3, 3, 100, 100), solution.rollingMax(new ArrayList<>(List.of(3, 2, 3, 100, 3))));
    }
}
