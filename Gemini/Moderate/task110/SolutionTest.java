package task110;

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
        // Ensures empty lists don't cause index or loop errors
        // 0 odds in list1 <= 0 evens in list2 -> YES
        assertEquals("YES", solution.exchange(new ArrayList<>(), new ArrayList<>()));
    }

    @Test
    @DisplayName("Logic Path: List 1 is already all evens (0 exchanges needed)")
    void testAlreadyAllEvens() {
        // Triggers branch where odd count is 0
        assertEquals("YES", solution.exchange(Arrays.asList(100, 200), Arrays.asList(200, 200)));
    }

    @Test
    @DisplayName("Logic Path: Sufficient evens available in List 2 (Returns YES)")
    void testSufficientEvens() {
        // Exact match: 3 odds in lst1, exactly 3 evens in lst2
        assertEquals("YES", solution.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 4)));
        
        // Mixed match: 2 odds in lst1, 2 evens in lst2
        assertEquals("YES", solution.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4)));
        
        // Flipped match: 2 odds in lst1, 2 evens in lst2 (different order)
        assertEquals("YES", solution.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 1, 4, 3)));
    }

    @Test
    @DisplayName("Logic Path: Insufficient evens available in List 2 (Returns NO)")
    void testInsufficientEvens() {
        // Deficit: 2 odds in lst1, but only 1 even in lst2
        assertEquals("NO", solution.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 5, 3, 4)));
        
        // Deficit: 3 odds in lst1, but only 2 evens in lst2
        assertEquals("NO", solution.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 3)));
        
        // Heavy Deficit: Multiple odds, 0 evens
        assertEquals("NO", solution.exchange(Arrays.asList(3, 2, 6, 1, 8, 9), Arrays.asList(3, 5, 5, 1, 1, 1)));
    }
}
