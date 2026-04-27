package task37;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty lists")
    void testBoundaryConditions() {
        // Ensures the algorithm safely handles empty lists without IndexOutOfBoundsExceptions
        assertEquals(new ArrayList<>(), solution.sortEven(new ArrayList<>()));
    }

    @Test
    @DisplayName("Logic Path: Small lists where sorting is bypassed")
    void testSmallLists() {
        // Triggers paths where the even-index sub-list has only 1 element (index 0)
        // Length 1
        assertEquals(Arrays.asList(5), solution.sortEven(new ArrayList<>(Arrays.asList(5))));
        // Length 2
        assertEquals(Arrays.asList(5, 6), solution.sortEven(new ArrayList<>(Arrays.asList(5, 6))));
    }

    @Test
    @DisplayName("Logic Path: Sorts only elements at even indices (Mixed & Negative)")
    void testEvenIndexSorting() {
        // Indices: 0(5), 2(3). Sorted: 3, 5. Index 1(6) and 3(4) remain unchanged.
        assertEquals(
            Arrays.asList(3, 6, 5, 4), 
            solution.sortEven(new ArrayList<>(Arrays.asList(5, 6, 3, 4)))
        );

        // Complex list with negatives
        // Even Indices: 0(5), 2(-12), 4(23), 6(3), 8(12)
        // Sorted Evens: -12, 3, 5, 12, 23
        assertEquals(
            Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10), 
            solution.sortEven(new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10)))
        );
    }

    @Test
    @DisplayName("Logic Path: Target elements are already sorted")
    void testAlreadySortedEvens() {
        // Indices: 0(1), 2(3) -> Already sorted
        assertEquals(
            Arrays.asList(1, 2, 3), 
            solution.sortEven(new ArrayList<>(Arrays.asList(1, 2, 3)))
        );
    }
}
