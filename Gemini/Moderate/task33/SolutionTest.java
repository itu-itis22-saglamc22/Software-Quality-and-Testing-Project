package task33;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty or null lists")
    void testBoundaryConditions() {
        // Ensures the algorithm safely handles empty lists without IndexOutOfBoundsExceptions
        assertEquals(new ArrayList<>(), solution.sortThird(new ArrayList<>()));
        
        // Uncomment if Solution.java handles null natively
        // assertNull(solution.sortThird(null));
    }

    @Test
    @DisplayName("Logic Path: Small lists where only index 0 is a multiple of 3")
    void testSmallLists() {
        // Triggers paths where the sorting sub-list has only 1 element
        assertEquals(Arrays.asList(1, 2, 3), solution.sortThird(new ArrayList<>(Arrays.asList(1, 2, 3))));
        assertEquals(Arrays.asList(5), solution.sortThird(new ArrayList<>(Arrays.asList(5))));
    }

    @Test
    @DisplayName("Logic Path: Sorts only elements at indices divisible by 3")
    void testThirdIndexSorting() {
        // Indices: 0, 3, 6 (Values: 5, 4, 2) -> Sorted: 2, 4, 5
        // Other indices remain completely unchanged
        assertEquals(
            Arrays.asList(2, 6, 3, 4, 8, 9, 5), 
            solution.sortThird(new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2)))
        );

        // Indices: 0, 3, 6 (Values: 5, 4, 2) with extra tail elements
        assertEquals(
            Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1), 
            solution.sortThird(new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1)))
        );
    }

    @Test
    @DisplayName("Logic Path: Target elements are already sorted")
    void testAlreadySortedThirds() {
        // Indices: 0, 3, 6 (Values: 2, 4, 5) -> Already sorted
        assertEquals(
            Arrays.asList(2, 6, 3, 4, 8, 9, 5), 
            solution.sortThird(new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5)))
        );
    }
}
