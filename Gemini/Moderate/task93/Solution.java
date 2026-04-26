package task93;

class Solution {
    /**
     * Encodes a message by swapping cases and shifting vowels forward by 2.
     */
    public String encode(String message) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for (char c : message.toCharArray()) {
            char processedChar = c;

            // 1. Swap Case
            if (Character.isUpperCase(c)) {
                processedChar = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                processedChar = Character.toUpperCase(c);
            }

            // 2. If the swapped character is a vowel, shift it by 2
            if (vowels.indexOf(processedChar) != -1) {
                // Shift by 2 within the alphabet
                // For 'a'/'A' -> 'c'/'C', for 'u'/'U' -> 'w'/'W'
                processedChar = (char) (processedChar + 2);
            }

            sb.append(processedChar);
        }
        return sb.toString();
    }
}