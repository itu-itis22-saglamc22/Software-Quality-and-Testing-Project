package task162;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.security.NoSuchAlgorithmException;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Smell Test: Guard clauses for null and empty strings")
    void testBoundaryConditions() throws NoSuchAlgorithmException {
        // Covers: if (text == null || text.isEmpty()) -> True paths
        assertTrue(solution.stringToMd5(null).isEmpty(), "Null input should return Optional.empty()");
        assertTrue(solution.stringToMd5("").isEmpty(), "Empty string should return Optional.empty()");
    }

    @Test
    @DisplayName("Logic Path: Standard MD5 Hashing (No Padding Required)")
    void testStandardHashing() throws NoSuchAlgorithmException {
        // Covers the branch where the BigInteger output is exactly 32 chars.
        // The while loop condition (hashtext.length() < 32) evaluates to False.
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", solution.stringToMd5("Hello world").get());
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", solution.stringToMd5("password").get());
    }

    @Test
    @DisplayName("Logic Path: Padded MD5 Hashing (BigInteger zero-stripping)")
    void testPaddedHashing() throws NoSuchAlgorithmException {
        // Covers the branch where the MD5 natively starts with '0'. 
        // BigInteger strips leading zeros, making the initial length < 32.
        // This forces the while loop (hashtext = "0" + hashtext) to execute.
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", solution.stringToMd5("A B C").get());
    }
}
