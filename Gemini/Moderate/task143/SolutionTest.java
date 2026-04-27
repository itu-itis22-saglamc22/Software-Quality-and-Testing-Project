package task143;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for null and empty sentences")
    void testBoundaryConditions() {
        // Ensures the algorithm safely handles empty inputs (Returns empty string)
        assertEquals("", solution.wordsInSentence(""));
        
        // Uncomment the line below if Solution.java includes defensive null checking
        // assertEquals("", solution.wordsInSentence(null), "Null should return an empty string safely");
    }

    @Test
    @DisplayName("Logic Path: Length < 2 (Not Prime)")
    void testLengthsLessThanTwo() {
        // Words of length 1 ("a", "I") should trigger the 'if (len < 2) return false' branch
        assertEquals("", solution.wordsInSentence("a I"));
    }

    @Test
    @DisplayName("Logic Path: Length == 2 (Base Prime) and Length > 2 (Odd Primes)")
    void testEvenAndOddPrimes() {
        // Length 2: "is", "Hi", "go", "am"
        // Length 3: "for"
        // Length 5: "there", "place"
        // Length 7: "Hussein"
        assertEquals("go for", solution.wordsInSentence("lets go for swimming"));
        assertEquals("Hi am Hussein", solution.wordsInSentence("Hi I am Hussein"));
        assertEquals("there is no place", solution.wordsInSentence("there is no place available here"));
    }

    @Test
    @DisplayName("Logic Path: Length > 2 and Even (Not Prime)")
    void testEvenNotPrime() {
        // Length 4: "This", "test", "lets", "here"
        // Length 8: "swimming"
        // Triggers the 'if (len % 2 == 0) return false' branch
        assertEquals("is", solution.wordsInSentence("This is a test"));
        assertEquals("", solution.wordsInSentence("here"));
    }

    @Test
    @DisplayName("Logic Path: Length > 2, Odd, and Not Prime (The Loop Branch)")
    void testOddNotPrime() {
        // Length 9: "available"
        // This is CRUCIAL for 100% coverage. 9 is odd, so it bypasses the '% 2' check,
        // forcing the algorithm to enter a for-loop and fail at '9 % 3 == 0'.
        assertEquals("is", solution.wordsInSentence("available is"));
    }
}
