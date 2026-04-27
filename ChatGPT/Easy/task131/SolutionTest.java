package task131;

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
    void singleOddDigitReturnsItself() {
        assertEquals(5, solution.digits(5));
    }

    @Test
    void twoDigitNumberWithOddTensReturnsOddTens() {
        assertEquals(5, solution.digits(54));
    }

    @Test
    void numberWithNoOddDigitsReturnsZero() {
        assertEquals(1, solution.digits(120));
    }

    @Test
    void fourDigitNumberWithOddStartReturnsOddProduct() {
        assertEquals(5, solution.digits(5014));
    }

    @Test
    void fiveDigitNumberReturnsProductOfOddDigits() {
        assertEquals(315, solution.digits(98765));
    }

    @Test
    void sevenDigitNumberReturnsProductOfOddDigits() {
        assertEquals(2625, solution.digits(5576543));
    }

    @Test
    void singleEvenDigitReturnsZero() {
        assertEquals(0, solution.digits(2));
    }

    @Test
    void allEvenDigitsReturnZero() {
        assertEquals(0, solution.digits(2468));
    }

    @Test
    void twoIdenticalOddDigitsReturnsProduct() {
        // 3 * 3 = 9
        assertEquals(9, solution.digits(33));
    }

    @Test
    void zeroInputReturnsZero() {
        // while loop never runs for input 0
        assertEquals(0, solution.digits(0));
    }
}
