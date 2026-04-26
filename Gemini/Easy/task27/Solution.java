package task27;

public class Solution {
    /**
     * For a given string, flip lowercase characters to uppercase
     * and uppercase to lowercase.
     * >>> flipCase("Hello")
     * "hELLO"
     */
    public String flipCase(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                // If it's not a letter (e.g., !, space, digit), keep it as is
                sb.append(c);
            }
        }
        return sb.toString();
    }
}