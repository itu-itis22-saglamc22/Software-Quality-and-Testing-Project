package task93;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for empty or null inputs")
    void testBoundaryConditions() {
        assertEquals("", solution.encode(""));
        // Uncomment if Solution.java includes defensive null checking
        // assertEquals("", solution.encode(null));
    }

    @Test
    @DisplayName("Logic Path: Case flipping and vowel shifting for simple words")
    void testStandardEncoding() {
        // 'T' -> 't', 'E' -> 'g' (shifted), 'S' -> 's', 'T' -> 't'
        assertEquals("tgst", solution.encode("TEST"));
        // 't' -> 'T', 'e' -> 'G' (shifted), 's' -> 'S', 't' -> 'T'
        assertEquals("TGST", solution.encode("test"));
        // 'Y' -> 'y', 'E' -> 'g', 'S' -> 's'
        assertEquals("ygs", solution.encode("YES"));
    }

    @Test
    @DisplayName("Logic Path: Complex names with mixed vowel cases")
    void testComplexVowels() {
        // 'M'->'m', 'u'->'W', 'd'->'D', 'a'->'C', 's'->'S', 'i'->'K', 'r'->'R'
        assertEquals("mWDCSKR", solution.encode("Mudasir"));
    }

    @Test
    @DisplayName("Logic Path: Handling spaces and non-alpha characters")
    void testNonAlphaCharacters() {
        // Ensures the 'else' branch for non-alpha (like spaces) is covered
        assertEquals("tHKS KS C MGSSCGG", solution.encode("This is a message"));
    }

    @Test
    @DisplayName("Logic Path: Full sentence with high variance")
    void testSentenceEncoding() {
        // Targets multiple transitions and various vowel/consonant pairings
        String input = "I DoNt KnOw WhAt tO WrItE";
        String expected = "k dQnT kNqW wHcT Tq wRkTg";
        assertEquals(expected, solution.encode(input));
    }
}
