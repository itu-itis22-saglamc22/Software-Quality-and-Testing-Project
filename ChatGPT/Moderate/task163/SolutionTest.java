package task163;

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
    void returnsEvenIntegersWithinForwardRange() {
        assertEquals(List.of(2, 4, 6, 8), solution.generateIntegers(2, 10));
    }

    @Test
    void returnsEvenIntegersWithinReversedRange() {
        assertEquals(List.of(2, 4, 6, 8), solution.generateIntegers(10, 2));
    }

    @Test
    void capsRangeAtUpperEvenBound() {
        assertEquals(List.of(2, 4, 6, 8), solution.generateIntegers(132, 2));
    }

    @Test
    void returnsEmptyListWhenRangeDoesNotOverlapAllowedValues() {
        assertEquals(List.of(), solution.generateIntegers(17, 89));
    }
}
