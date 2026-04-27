package task162;

import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private static final String HELLO_WORLD_MD5 = "3e25960a79dbc69b674cd4ec67a72c62";
    private static final String SPACED_LETTERS_MD5 = "0ef78513b0cb8cef12743f5aeb35f888";
    private static final String PASSWORD_MD5 = "5f4dcc3b5aa765d61d8327deb882cf99";

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void hashesHelloWorldText() throws NoSuchAlgorithmException {
        assertEquals(HELLO_WORLD_MD5, solution.stringToMd5("Hello world").orElseThrow());
    }

    @Test
    void emptyTextReturnsEmptyOptional() throws NoSuchAlgorithmException {
        assertTrue(solution.stringToMd5("").isEmpty());
    }

    @Test
    void hashesTextContainingSpaces() throws NoSuchAlgorithmException {
        assertEquals(SPACED_LETTERS_MD5, solution.stringToMd5("A B C").orElseThrow());
    }

    @Test
    void hashesPasswordText() throws NoSuchAlgorithmException {
        assertEquals(PASSWORD_MD5, solution.stringToMd5("password").orElseThrow());
    }
}
