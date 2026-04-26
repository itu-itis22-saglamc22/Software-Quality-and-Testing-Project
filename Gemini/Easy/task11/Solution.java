package task11;

public class Solution {
    /**
     * Test if given string is a palindrome
     */
    public boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * Find the shortest palindrome that begins with a supplied string.
     */
    public String makePalindrome(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        // 1. Find the longest postfix that is a palindrome
        int longestPalindromeSuffixStart = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isPalindrome(string.substring(i))) {
                longestPalindromeSuffixStart = i;
                break;
            }
        }

        // 2. Get the prefix that comes before that suffix
        String prefix = string.substring(0, longestPalindromeSuffixStart);

        // 3. Reverse that prefix
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();

        // 4. Append the reversed prefix to the original string
        return string + reversedPrefix;
    }
}