package task23;

public class Solution {
    /**
     * Return length of given string
     * >>> strlen("")
     * 0
     * >>> strlen("abc")
     * 3
     */
    public int strlen(String string) {
        if (string == null) {
            return 0;
        }
        return string.length();
    }
}