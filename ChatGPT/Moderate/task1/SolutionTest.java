package task1;

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
    void separatesMixedDepthGroups() {
        assertEquals(
                List.of("(()())", "((()))", "()", "((())()())"),
                solution.separateParenGroups("(()()) ((())) () ((())()())"));
    }

    @Test
    void separatesIncreasingDepthGroups() {
        assertEquals(
                List.of("()", "(())", "((()))", "(((())))"),
                solution.separateParenGroups("() (()) ((())) (((())))"));
    }

    @Test
    void keepsNestedGroupWithoutSpacesAsOneGroup() {
        assertEquals(
                List.of("(()(())((())))"),
                solution.separateParenGroups("(()(())((())))"));
    }

    @Test
    void ignoresSpacesInsideGroups() {
        assertEquals(List.of("()", "(())", "(()())"), solution.separateParenGroups("( ) (( )) (( )( ))"));
    }
}
