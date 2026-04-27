package task8;

import java.util.ArrayList;
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
    void emptyListReturnsSumZeroAndProductIdentity() {
        assertEquals(List.of(0, 1), solution.sumProduct(new ArrayList<>()));
    }

    @Test
    void allOnesHaveSumThreeAndProductOne() {
        assertEquals(List.of(3, 1), solution.sumProduct(new ArrayList<>(List.of(1, 1, 1))));
    }

    @Test
    void zeroElementMakesProductZero() {
        assertEquals(List.of(100, 0), solution.sumProduct(new ArrayList<>(List.of(100, 0))));
    }

    @Test
    void positiveValuesReturnTheirSumAndProduct() {
        assertEquals(List.of(15, 105), solution.sumProduct(new ArrayList<>(List.of(3, 5, 7))));
    }

    @Test
    void singleValueIsBothSumAndProduct() {
        assertEquals(List.of(10, 10), solution.sumProduct(new ArrayList<>(List.of(10))));
    }
}
