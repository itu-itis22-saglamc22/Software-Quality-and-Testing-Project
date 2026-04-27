package task93;

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
    void encodesUppercaseWord() {
        assertEquals("tgst", solution.encode("TEST"));
    }

    @Test
    void encodesMixedCaseName() {
        assertEquals("mWDCSKR", solution.encode("Mudasir"));
    }

    @Test
    void encodesUppercaseWordWithVowelShift() {
        assertEquals("ygs", solution.encode("YES"));
    }

    @Test
    void encodesSentenceWithSpaces() {
        assertEquals("tHKS KS C MGSSCGG", solution.encode("This is a message"));
    }

    @Test
    void encodesAlternatingCaseSentence() {
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", solution.encode("I DoNt KnOw WhAt tO WrItE"));
    }
}
