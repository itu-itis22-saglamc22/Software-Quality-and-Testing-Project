package task129;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Path length of zero should return empty list")
    void testZeroLengthPath() {
        // Covers the branch where the path construction loop 'for(int i=0; i<k; i++)' does not execute
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );
        assertEquals(new ArrayList<>(), solution.minPath(grid, 0));
    }

    @Test
    @DisplayName("Logic Path: '1' at Top-Left Corner (Tests Negative Out-of-Bounds)")
    void testOneAtTopLeft() {
        // '1' is at (0,0). Tests branches: newRow < 0 and newCol < 0
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        assertEquals(Arrays.asList(1, 2, 1), solution.minPath(grid, 3));
    }

    @Test
    @DisplayName("Logic Path: '1' at Bottom-Right Corner (Tests Positive Out-of-Bounds)")
    void testOneAtBottomRight() {
        // '1' is at (2,2). Tests branches: newRow >= n and newCol >= n
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(5, 9, 3),
                Arrays.asList(4, 8, 6),
                Arrays.asList(7, 2, 1)
        );
        // Smallest neighbor of 1 at (2,2) is 2 at (2,1) or 6 at (1,2) -> minimum is 2
        assertEquals(Arrays.asList(1, 2, 1, 2), solution.minPath(grid, 4));
    }

    @Test
    @DisplayName("Logic Path: '1' in the Middle (Tests All Valid Directions)")
    void testOneInMiddle() {
        // '1' is at (1,1). Tests the true paths for all boundary checks.
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(5, 9, 3),
                Arrays.asList(4, 1, 6),
                Arrays.asList(7, 8, 2)
        );
        // Neighbors: 9(up), 8(down), 4(left), 6(right). Minimum is 4.
        assertEquals(List.of(1), solution.minPath(grid, 1));
        assertEquals(Arrays.asList(1, 4, 1), solution.minPath(grid, 3));
    }
}
