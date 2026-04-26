package task10;

class Solution {
    public boolean isPalindrome(String string) {
        if (string == null) {
            return false;
        }

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

    public String makePalindrome(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        int beginningOfSuffix = 0;

        while (!isPalindrome(string.substring(beginningOfSuffix))) {
            beginningOfSuffix++;
        }

        StringBuilder reversedPrefix = new StringBuilder(string.substring(0, beginningOfSuffix));
        return string + reversedPrefix.reverse().toString();
    }
}