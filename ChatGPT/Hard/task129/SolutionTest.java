package task129;

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
    void orderedThreeByThreeAlternatesWithRightNeighbor() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));

        assertEquals(List.of(1, 2, 1), solution.minPath(grid, 3));
    }

    @Test
    void lengthOnePathContainsOnlyTheMinimumCell() {
        List<List<Integer>> grid = List.of(
                List.of(5, 9, 3),
                List.of(4, 1, 6),
                List.of(7, 8, 2));

        assertEquals(List.of(1), solution.minPath(grid, 1));
    }

    @Test
    void orderedFourByFourAlternatesWithNearestNeighbor() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8),
                List.of(9, 10, 11, 12),
                List.of(13, 14, 15, 16));

        assertEquals(List.of(1, 2, 1, 2), solution.minPath(grid, 4));
    }

    @Test
    void rightEdgeMinimumUsesLeftNeighbor() {
        List<List<Integer>> grid = List.of(
                List.of(6, 4, 13, 10),
                List.of(5, 7, 12, 1),
                List.of(3, 16, 11, 15),
                List.of(8, 14, 9, 2));

        assertEquals(List.of(1, 10, 1, 10, 1, 10, 1), solution.minPath(grid, 7));
    }

    @Test
    void interiorMinimumUsesSmallestAdjacentValue() {
        List<List<Integer>> grid = List.of(
                List.of(8, 14, 9, 2),
                List.of(6, 4, 13, 15),
                List.of(5, 7, 1, 12),
                List.of(3, 10, 11, 16));

        assertEquals(List.of(1, 7, 1, 7, 1), solution.minPath(grid, 5));
    }

    @Test
    void bottomRightMinimumUsesSmallestAdjacentValueForNineSteps() {
        List<List<Integer>> grid = List.of(
                List.of(11, 8, 7, 2),
                List.of(5, 16, 14, 4),
                List.of(9, 3, 15, 6),
                List.of(12, 13, 10, 1));

        assertEquals(List.of(1, 6, 1, 6, 1, 6, 1, 6, 1), solution.minPath(grid, 9));
    }

    @Test
    void topRightMinimumUsesSmallestAdjacentValueForTwelveSteps() {
        List<List<Integer>> grid = List.of(
                List.of(12, 13, 10, 1),
                List.of(9, 3, 15, 6),
                List.of(5, 16, 14, 4),
                List.of(11, 8, 7, 2));

        assertEquals(List.of(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6), solution.minPath(grid, 12));
    }

    @Test
    void centeredMinimumUsesUpperNeighborWhenItIsSmallest() {
        List<List<Integer>> grid = List.of(
                List.of(2, 7, 4),
                List.of(3, 1, 5),
                List.of(6, 8, 9));

        assertEquals(List.of(1, 3, 1, 3, 1, 3, 1, 3), solution.minPath(grid, 8));
    }

    @Test
    void topCenterMinimumUsesRightNeighborWhenItIsSmallest() {
        List<List<Integer>> grid = List.of(
                List.of(6, 1, 5),
                List.of(3, 8, 9),
                List.of(2, 7, 4));

        assertEquals(List.of(1, 5, 1, 5, 1, 5, 1, 5), solution.minPath(grid, 8));
    }

    @Test
    void twoByTwoGridAlternatesForTenSteps() {
        List<List<Integer>> grid = List.of(
                List.of(1, 2),
                List.of(3, 4));

        assertEquals(List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2), solution.minPath(grid, 10));
    }

    @Test
    void twoByTwoGridUsesTiedNeighborValueForTenSteps() {
        List<List<Integer>> grid = List.of(
                List.of(1, 3),
                List.of(3, 2));

        assertEquals(List.of(1, 3, 1, 3, 1, 3, 1, 3, 1, 3), solution.minPath(grid, 10));
    }
}
