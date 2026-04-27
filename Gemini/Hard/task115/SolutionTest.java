package task115;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void testMixedGridWithCapacityOne() {
        Solution s = new Solution();

        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 0),
                Arrays.asList(0, 1, 0, 0),
                Arrays.asList(1, 1, 1, 1));

        assertEquals(6, s.maxFill(grid, 1));
    }

    @Test
    void testMixedGridWithCapacityTwo() {
        Solution s = new Solution();

        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 1),
                Arrays.asList(0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(0, 1, 1, 1));

        assertEquals(5, s.maxFill(grid, 2));
    }

    @Test
    void testEmptyGridValues() {
        Solution s = new Solution();

        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 0));

        assertEquals(0, s.maxFill(grid, 5));
    }

    @Test
    void testFullGridWithCapacityTwo() {
        Solution s = new Solution();

        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1));

        assertEquals(4, s.maxFill(grid, 2));
    }

    @Test
    void testFullGridWithLargeCapacity() {
        Solution s = new Solution();

        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 1));

        assertEquals(2, s.maxFill(grid, 9));
    }
}
