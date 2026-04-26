package task143;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String wordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        List<String> result = new ArrayList<>();

        for (String word : sentence.split(" ")) {
            if (isPrime(word.length())) {
                result.add(word);
            }
        }

        return String.join(" ", result);
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}