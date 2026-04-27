package task13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void gcdOfCoprimeNumbersReturnsOne() {
        assertEquals(1, solution.greatestCommonDivisor(3, 7));
    }

    @Test
    void gcdOfMultiplesReturnsDivisor() {
        assertEquals(5, solution.greatestCommonDivisor(10, 15));
        assertEquals(7, solution.greatestCommonDivisor(49, 14));
        assertEquals(12, solution.greatestCommonDivisor(144, 60));
    }

    @Test
    void gcdWhenFirstNumberIsZeroReturnsSecond() {
        assertEquals(7, solution.greatestCommonDivisor(0, 7));
    }

    @Test
    void gcdWhenSecondNumberIsZeroReturnsFirst() {
        assertEquals(9, solution.greatestCommonDivisor(9, 0));
    }

    @Test
    void gcdOfEqualNumbersReturnsThatNumber() {
        assertEquals(6, solution.greatestCommonDivisor(6, 6));
    }

    @Test
    void gcdWhenFirstGreaterReturnsCorrectDivisor() {
        assertEquals(4, solution.greatestCommonDivisor(20, 8));
    }

    @Test
    void gcdWhenSecondGreaterReturnsCorrectDivisor() {
        assertEquals(3, solution.greatestCommonDivisor(6, 21));
    }
}
