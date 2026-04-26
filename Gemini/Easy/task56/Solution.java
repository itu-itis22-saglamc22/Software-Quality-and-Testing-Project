package task56;

public class Solution {
    /**
     * brackets is a string of "<" and ">".
     * return True if every opening bracket has a corresponding closing bracket.
     */
    public boolean correctBracketing(String brackets) {
        if (brackets == null) {
            return true;
        }

        int balance = 0;
        for (int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);
            if (c == '<') {
                balance++;
            } else if (c == '>') {
                balance--;
            }

            // If balance is negative, a closing bracket appeared
            // without a preceding opening bracket.
            if (balance < 0) {
                return false;
            }
        }

        // If balance is zero, all brackets were correctly matched.
        return balance == 0;
    }
}