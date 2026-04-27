package task143;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void keepsOnlyPrimeLengthWordInShortSentence() {
        assertEquals("is", solution.wordsInSentence("This is a test"));
    }

    @Test
    void keepsMultiplePrimeLengthWords() {
        assertEquals("go for", solution.wordsInSentence("lets go for swimming"));
    }

    @Test
    void dropsWordsWhoseLengthsAreNotPrime() {
        assertEquals("there is no place", solution.wordsInSentence("there is no place available here"));
    }

    @Test
    void keepsPrimeLengthNamesAndShortWords() {
        assertEquals("Hi am Hussein", solution.wordsInSentence("Hi I am Hussein"));
    }

    @Test
    void keepsAllWordsWhenEveryLengthIsPrime() {
        assertEquals("go for it", solution.wordsInSentence("go for it"));
    }

    @Test
    void returnsEmptyStringWhenNoWordLengthIsPrime() {
        assertEquals("", solution.wordsInSentence("here"));
    }

    @Test
    void keepsPrimeLengthWordAfterNonPrimeWord() {
        assertEquals("is", solution.wordsInSentence("here is"));
    }
}
