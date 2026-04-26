package task131;

public class Solution {
    /**
     * Given a positive integer n, return the product of the odd digits.
     * Return 0 if all digits are even.
     */
    public int digits(int n) {
        int product = 1;
        boolean hasOdd = false;

        // Handle case where n is 0 (though prompt says positive integer)
        if (n == 0)
            return 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                product *= digit;
                hasOdd = true;
            }
            n /= 10;
        }

        return hasOdd ? product : 0;
    }
}