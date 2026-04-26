package task143;

import java.util.*;

class Solution {
    /**
     * Checks if a number is prime.
     */
    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Returns a string of words from the sentence whose lengths are prime numbers.
     */
    public String wordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isPrime(word.length())) {
                result.add(word);
            }
        }

        return String.join(" ", result);
    }
}