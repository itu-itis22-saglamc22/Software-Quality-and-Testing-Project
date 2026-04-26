package task32;

import java.util.List;

class Solution {
    public double poly(List<Double> xs, double x) {
        if (xs == null || xs.isEmpty()) {
            return 0.0;
        }

        double result = 0.0;

        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }

        return result;
    }

    public double findZero(List<Double> xs) {
        double begin = -1.0;
        double end = 1.0;

        while (poly(xs, begin) * poly(xs, end) > 0) {
            begin *= 2.0;
            end *= 2.0;
        }

        while (end - begin > 1e-10) {
            double center = (begin + end) / 2.0;

            if (poly(xs, begin) * poly(xs, center) > 0) {
                begin = center;
            } else {
                end = center;
            }
        }

        return begin;
    }
}