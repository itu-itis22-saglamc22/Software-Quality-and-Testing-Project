package task14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void emptyStringReturnsEmptyPrefixList() {
        assertEquals(List.of(), solution.allPrefixes(""));
    }

    @Test
    void sixCharStringReturnsAllPrefixes() {
        assertEquals(
            Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"),
            solution.allPrefixes("asdfgh"));
    }

    @Test
    void threeCharStringReturnsAllPrefixes() {
        assertEquals(Arrays.asList("W", "WW", "WWW"), solution.allPrefixes("WWW"));
    }
}
