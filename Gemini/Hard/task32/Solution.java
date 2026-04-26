package task32;

import java.util.*;

class Solution {
    /**
     * Evaluates polynomial with coefficients xs at point x.
     * returns xs[0] + xs[1] * x + xs[2] * x^2 + .... xs[n] * x^n
     */
    public double poly(List<Double> xs, double x) {
        double result = 0;
        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Finds a zero point for the polynomial.
     * Uses the Bisection Method to converge on a solution.
     */
    public double findZero(List<Double> xs) {
        // 1. Find a range [begin, end] where the function changes sign.
        // Because the degree is odd (even number of coefficients), such a range must
        // exist.
        double begin = -1.0;
        double end = 1.0;

        // Expand the bounds until we find points with opposite signs
        while (poly(xs, begin) * poly(xs, end) > 0) {
            begin *= 2;
            end *= 2;
        }

        // 2. Perform Bisection Method
        // We refine the interval [begin, end] until the width is sufficiently small.
        double epsilon = 1e-10;
        while (end - begin > epsilon) {
            double mid = (begin + end) / 2.0;

            // If poly(begin) and poly(mid) have the same sign, the root is in [mid, end]
            if (poly(xs, begin) * poly(xs, mid) > 0) {
                begin = mid;
            } else {
                // Otherwise, the root is in [begin, mid]
                end = mid;
            }
        }

        return begin;
    }
}