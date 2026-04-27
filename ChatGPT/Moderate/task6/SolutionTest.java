package task6;

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
    void returnsDepthForMixedParenGroups() {
        assertEquals(List.of(2, 3, 1, 3), solution.parseNestedParens("(()()) ((())) () ((())()())"));
    }

    @Test
    void returnsIncreasingDepthsForIncreasinglyNestedGroups() {
        assertEquals(List.of(1, 2, 3, 4), solution.parseNestedParens("() (()) ((())) (((())))"));
    }

    @Test
    void returnsDepthForSingleNestedGroupWithoutSpaces() {
        assertEquals(List.of(4), solution.parseNestedParens("(()(())((())))"));
    }
}
