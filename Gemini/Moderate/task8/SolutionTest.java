package task8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses and initial state for empty lists")
    void testBoundaryConditions() {
        // Empty list bypasses the loop. Should return initial accumulators: sum=0, prod=1
        assertEquals(Arrays.asList(0, 1), solution.sumProduct(new ArrayList<>()));
        
        // Uncomment if Solution.java includes defensive null checking
        // assertEquals(Arrays.asList(0, 1), solution.sumProduct(null));
    }

    @Test
    @DisplayName("Logic Path: Single element evaluation")
    void testSingleElement() {
        // Loop runs exactly once. Sum = 10, Product = 10
        assertEquals(Arrays.asList(10, 10), solution.sumProduct(new ArrayList<>(Arrays.asList(10))));
    }

    @Test
    @DisplayName("Logic Path: Zero property in multiplication")
    void testZeroMultiplication() {
        // Includes a zero. The product accumulator must drop to 0 and stay 0.
        // Sum = 100 + 0 = 100. Prod = 100 * 0 = 0.
        assertEquals(Arrays.asList(100, 0), solution.sumProduct(new ArrayList<>(Arrays.asList(100, 0))));
        
        // Zero in the middle of a larger list
        assertEquals(Arrays.asList(10, 0), solution.sumProduct(new ArrayList<>(Arrays.asList(2, 3, 0, 5))));
    }

    @Test
    @DisplayName("Logic Path: Standard execution with positive and negative numbers")
    void testStandardAndNegativeExecution() {
        // Sequential numbers
        assertEquals(Arrays.asList(10, 24), solution.sumProduct(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        
        // Uniform numbers
        assertEquals(Arrays.asList(3, 1), solution.sumProduct(new ArrayList<>(Arrays.asList(1, 1, 1))));
        
        // Prime numbers
        assertEquals(Arrays.asList(15, 105), solution.sumProduct(new ArrayList<>(Arrays.asList(3, 5, 7))));
        
        // Negative numbers: Sum = -1 + 2 + -3 = -2. Prod = -1 * 2 * -3 = 6.
        assertEquals(Arrays.asList(-2, 6), solution.sumProduct(new ArrayList<>(Arrays.asList(-1, 2, -3))));
    }
}
