package task32;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Example Tests
        List<Boolean> correct = Arrays.asList(
                Math.abs(s.findZero(new ArrayList<>(Arrays.asList(1.0, 2.0))) + 0.5) < 1e-4,
                Math.abs(s.findZero(new ArrayList<>(Arrays.asList(-6.0, 11.0, -6.0, 1.0))) - 1.0) < 1e-4);

        // Randomized Tests (Checking if f(solution) is near zero)
        Random rand = new Random(42);
        boolean randomTestsPassed = true;
        for (int i = 0; i < 100; i++) {
            int ncoeff = 2 * (rand.nextInt(3) + 1);
            List<Double> coeffs = new ArrayList<>();
            for (int j = 0; j < ncoeff; j++) {
                int coeff = rand.nextInt(20) - 10;
                if (coeff == 0)
                    coeff = 1;
                coeffs.add((double) coeff);
            }
            double solution = s.findZero(coeffs);
            if (Math.abs(s.poly(coeffs, solution)) > 1e-4) {
                randomTestsPassed = false;
                break;
            }
        }

        if (correct.contains(false) || !randomTestsPassed) {
            throw new AssertionError("Zero finding failed!");
        } else {
            System.out.println("Task 32: All tests passed successfully!");
        }
    }
}