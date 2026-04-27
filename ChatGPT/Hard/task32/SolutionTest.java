package task32;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private static final int RANDOM_SEED = 42;
    private static final int GENERATED_CASE_COUNT = 100;
    private static final int MAX_RANDOM_DEGREE_BUCKETS = 3;
    private static final int EVEN_COEFFICIENT_COUNT_FACTOR = 2;
    private static final int COEFFICIENT_RANGE = 20;
    private static final int COEFFICIENT_OFFSET = 10;
    private static final int ZERO_REPLACEMENT_COEFFICIENT = 1;
    private static final double ROOT_RESIDUAL_TOLERANCE = 1e-4;

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void seededEvenDegreePolynomialsHaveNearZeroResidualAtFoundRoot() {
        assertAll(generatedCoefficientSets().stream()
                .map(coefficients -> (Executable) () -> assertRootResidualWithinTolerance(coefficients)));
    }

    private List<List<Double>> generatedCoefficientSets() {
        Random random = new Random(RANDOM_SEED);
        List<List<Double>> coefficientSets = new ArrayList<>();

        for (int i = 0; i < GENERATED_CASE_COUNT; i++) {
            coefficientSets.add(generatedCoefficients(random));
        }

        return coefficientSets;
    }

    private List<Double> generatedCoefficients(Random random) {
        int coefficientCount = EVEN_COEFFICIENT_COUNT_FACTOR * (random.nextInt(MAX_RANDOM_DEGREE_BUCKETS) + 1);
        List<Double> coefficients = new ArrayList<>();

        for (int j = 0; j < coefficientCount; j++) {
            coefficients.add((double) nonZeroCoefficient(random));
        }

        return coefficients;
    }

    private int nonZeroCoefficient(Random random) {
        int coefficient = random.nextInt(COEFFICIENT_RANGE) - COEFFICIENT_OFFSET;
        return coefficient == 0 ? ZERO_REPLACEMENT_COEFFICIENT : coefficient;
    }

    private void assertRootResidualWithinTolerance(List<Double> coefficients) {
        double zero = solution.findZero(coefficients);
        assertTrue(
                Math.abs(solution.poly(coefficients, zero)) <= ROOT_RESIDUAL_TOLERANCE,
                () -> "Residual exceeded tolerance for coefficients " + coefficients);
    }
}
