package task110;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final String EXCHANGE_POSSIBLE = "YES";
    private static final String EXCHANGE_NOT_POSSIBLE = "NO";

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void balancedOddAndEvenCountsCanBeExchanged() {
        assertEquals(EXCHANGE_POSSIBLE, solution.exchange(List.of(1, 2, 3, 4), List.of(1, 2, 3, 4)));
    }

    @Test
    void notEnoughEvenNumbersInSecondListCannotBeExchanged() {
        assertEquals(EXCHANGE_NOT_POSSIBLE, solution.exchange(List.of(1, 2, 3, 4), List.of(1, 5, 3, 4)));
    }

    @Test
    void reorderedParityValuesCanBeExchanged() {
        assertEquals(EXCHANGE_POSSIBLE, solution.exchange(List.of(1, 2, 3, 4), List.of(2, 1, 4, 3)));
    }

    @Test
    void allOddFirstListCanExchangeWithAllEvenSecondList() {
        assertEquals(EXCHANGE_POSSIBLE, solution.exchange(List.of(5, 7, 3), List.of(2, 6, 4)));
    }

    @Test
    void oneOddInSecondListMakesExchangeImpossible() {
        assertEquals(EXCHANGE_NOT_POSSIBLE, solution.exchange(List.of(5, 7, 3), List.of(2, 6, 3)));
    }

    @Test
    void manyOddValuesNeedEnoughEvenReplacements() {
        assertEquals(
                EXCHANGE_NOT_POSSIBLE,
                solution.exchange(List.of(3, 2, 6, 1, 8, 9), List.of(3, 5, 5, 1, 1, 1)));
    }

    @Test
    void largeEvenValuesCanSatisfyExchange() {
        assertEquals(EXCHANGE_POSSIBLE, solution.exchange(List.of(100, 200), List.of(200, 200)));
    }
}
