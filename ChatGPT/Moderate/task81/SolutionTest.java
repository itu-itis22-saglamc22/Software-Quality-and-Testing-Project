package task81;

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
    void convertsMixedPassingGrades() {
        assertEquals(
                List.of("A+", "B", "C-", "C", "A-"),
                solution.numericalLetterGrade(new ArrayList<>(List.of(4.0, 3.0, 1.7, 2.0, 3.5))));
    }

    @Test
    void convertsDPlusBoundaryGrade() {
        assertEquals(List.of("D+"), solution.numericalLetterGrade(new ArrayList<>(List.of(1.2))));
    }

    @Test
    void convertsDMinusGrade() {
        assertEquals(List.of("D-"), solution.numericalLetterGrade(new ArrayList<>(List.of(0.5))));
    }

    @Test
    void convertsZeroGradeToE() {
        assertEquals(List.of("E"), solution.numericalLetterGrade(new ArrayList<>(List.of(0.0))));
    }

    @Test
    void convertsLowerRangeGrades() {
        assertEquals(
                List.of("D", "D-", "C-", "B", "B+"),
                solution.numericalLetterGrade(new ArrayList<>(List.of(1.0, 0.3, 1.5, 2.8, 3.3))));
    }

    @Test
    void distinguishesZeroFromLowPositiveGrade() {
        assertEquals(List.of("E", "D-"), solution.numericalLetterGrade(new ArrayList<>(List.of(0.0, 0.7))));
    }
}
