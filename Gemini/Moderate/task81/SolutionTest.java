package task81;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty or null inputs")
    void testBoundaryConditions() {
        assertEquals(new ArrayList<>(), solution.numericalLetterGrade(new ArrayList<>()));
        // Uncomment if Solution.java handles null
        // assertEquals(new ArrayList<>(), solution.numericalLetterGrade(null));
    }

    @Test
    @DisplayName("Logic Path: High Grade Brackets (A+ to B)")
    void testHighGradeBrackets() {
        // 4.0 -> A+, 3.5 -> A-, 3.3 -> B+, 3.0 -> B
        List<Double> gpas = Arrays.asList(4.0, 3.5, 3.3, 3.0);
        List<String> expected = Arrays.asList("A+", "A-", "B+", "B");
        assertEquals(expected, solution.numericalLetterGrade(new ArrayList<>(gpas)));
    }

    @Test
    @DisplayName("Logic Path: Middle Grade Brackets (C- to B)")
    void testMidGradeBrackets() {
        // 2.8 -> B, 2.0 -> C, 1.7 -> C-, 1.5 -> C-
        List<Double> gpas = Arrays.asList(2.8, 2.0, 1.7, 1.5);
        List<String> expected = Arrays.asList("B", "C", "C-", "C-");
        assertEquals(expected, solution.numericalLetterGrade(new ArrayList<>(gpas)));
    }

    @Test
    @DisplayName("Logic Path: Low Grade Brackets (D+ to E)")
    void testLowGradeBrackets() {
        // 1.2 -> D+, 1.0 -> D, 0.7 -> D-, 0.3 -> D-, 0.0 -> E
        // This targets the bottom thresholds and the final 'else' catch-all.
        List<Double> gpas = Arrays.asList(1.2, 1.0, 0.7, 0.3, 0.0);
        List<String> expected = Arrays.asList("D+", "D", "D-", "D-", "E");
        assertEquals(expected, solution.numericalLetterGrade(new ArrayList<>(gpas)));
    }
}
