package task162;

import java.math.BigInteger;
import java.security.*;
import java.util.*;

class Solution {
    /**
     * Given a string "text", return its md5 hash equivalent string with length
     * being 32.
     * If "text" is an empty string, return Optional.empty().
     */
    public Optional<String> stringToMd5(String text) throws NoSuchAlgorithmException {
        if (text == null || text.isEmpty()) {
            return Optional.empty();
        }

        // 1. Get the MD5 MessageDigest instance
        MessageDigest md = MessageDigest.getInstance("MD5");

        // 2. Compute the hash (returns a byte array)
        byte[] messageDigest = md.digest(text.getBytes());

        // 3. Convert the byte array into a signum representation
        // 1 means a positive number
        BigInteger no = new BigInteger(1, messageDigest);

        // 4. Convert message digest into hex value
        String hashtext = no.toString(16);

        // 5. Add preceding 0s to make it 32 characters long
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }

        return Optional.of(hashtext);
    }
}