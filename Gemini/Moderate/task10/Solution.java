package task10;

class Solution {
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

        int beginningOfSuffix = 0;

        // Iterate through the string to find the start of the longest palindromic
        // suffix
        while (!isPalindrome(string.substring(beginningOfSuffix))) {
            beginningOfSuffix++;
        }

        // The part before the suffix needs to be reversed and appended
        String prefixToMirror = string.substring(0, beginningOfSuffix);
        String reversedPrefix = new StringBuilder(prefixToMirror).reverse().toString();

        return string + reversedPrefix;
    }
}