package task131;

class Solution {
    public int digits(int n) {
        int product = 1;
        int oddCount = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                product *= digit;
                oddCount++;
            }
            n /= 10;
        }

        return oddCount == 0 ? 0 : product;
    }
}