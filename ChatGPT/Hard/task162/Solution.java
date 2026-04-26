package task162;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

class Solution {
    public Optional<String> stringToMd5(String text) throws NoSuchAlgorithmException {
        if (text == null || text.isEmpty()) {
            return Optional.empty();
        }

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(text.getBytes());

        String hash = new BigInteger(1, digest).toString(16);

        while (hash.length() < 32) {
            hash = "0" + hash;
        }

        return Optional.of(hash);
    }
}