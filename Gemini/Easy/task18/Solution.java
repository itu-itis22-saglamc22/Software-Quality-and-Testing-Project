package task18;

public class Solution {
    /**
     * Find how many times a given substring can be found in the original string.
     * Count overlapping cases.
     */
    public int howManyTimes(String string, String substring) {
        if (string == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Search for the substring starting from the current index
        while ((index = string.indexOf(substring, index)) != -1) {
            count++;
            // To catch overlaps, move the index forward by only 1
            // instead of substring.length()
            index++;
        }

        return count;
    }
}