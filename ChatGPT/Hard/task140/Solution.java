package task140;

class Solution {
    public String fixSpaces(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int spaceCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                spaceCount++;
            } else {
                appendSpaces(sb, spaceCount);
                spaceCount = 0;
                sb.append(c);
            }
        }

        appendSpaces(sb, spaceCount);
        return sb.toString();
    }

    private void appendSpaces(StringBuilder sb, int spaceCount) {
        if (spaceCount > 2) {
            sb.append('-');
        } else {
            for (int i = 0; i < spaceCount; i++) {
                sb.append('_');
            }
        }
    }
}