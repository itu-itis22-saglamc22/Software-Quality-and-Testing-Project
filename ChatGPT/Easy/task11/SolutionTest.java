package task11;

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
    void stringXorWithMixedBitsReturnsCorrectResult() {
        assertEquals("010010", solution.stringXor("111000", "101010"));
    }

    @Test
    void stringXorOfIdenticalOnesReturnsZero() {
        assertEquals("0", solution.stringXor("1", "1"));
    }

    @Test
    void stringXorWithAllZerosReturnsSameString() {
        assertEquals("0101", solution.stringXor("0101", "0000"));
    }
}
