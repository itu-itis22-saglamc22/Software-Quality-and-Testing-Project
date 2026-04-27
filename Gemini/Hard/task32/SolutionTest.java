package task32;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();
    private static final double EPSILON = 1e-4;

    @Test
    @DisplayName("Logic Path: Linear Polynomial (Degree 1)")
    void testLinearPolynomial() {
        // Equation: 1.0 + 2.0*x = 0 => x = -0.5
        List<Double> coeffs = Arrays.asList(1.0, 2.0);
        assertEquals(-0.5, solution.findZero(coeffs), EPSILON, "Failed to find root for linear equation.");
    }

    @Test
    @DisplayName("Logic Path: Cubic Polynomial (Degree 3)")
    void testCubicPolynomial() {
        // Equation: -6.0 + 11.0*x - 6.0*x^2 + 1.0*x^3 = 0
        // Roots are 1.0, 2.0, 3.0. The algorithm should find 1.0 based on initial bounds.
        List<Double> coeffs = Arrays.asList(-6.0, 11.0, -6.0, 1.0);
        assertEquals(1.0, solution.findZero(coeffs), EPSILON, "Failed to find root for cubic equation.");
    }

    @Test
    @DisplayName("Boundary Check: Root is exactly at zero")
    void testRootExactlyZero() {
        // Equation: 0.0 + 1.0*x = 0 => x = 0.0
        List<Double> coeffs = Arrays.asList(0.0, 1.0);
        assertEquals(0.0, solution.findZero(coeffs), EPSILON, "Failed to converge exactly on zero.");
    }

    @Test
    @DisplayName("Smell Test: Deterministic Property Verification (Replaces Flaky Random Test)")
    void testPolynomialProperty() {
        // Instead of randomizing, we use a deterministic high-degree polynomial
        // Equation: x^5 - x = 0 -> coeffs: [0, -1, 0, 0, 0, 1]
        // Roots are -1, 0, 1
        List<Double> coeffs = Arrays.asList(0.0, -1.0, 0.0, 0.0, 0.0, 1.0);
        
        // Find the root
        double root = solution.findZero(coeffs);
        
        // Verify the property: f(root) should be extremely close to 0
        double evaluatedValue = solution.poly(coeffs, root);
        assertEquals(0.0, evaluatedValue, EPSILON, "The found root did not evaluate to zero.");
    }
}
