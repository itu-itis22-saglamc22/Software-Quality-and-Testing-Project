package task140;

class Solution {
    /**
     * Replaces spaces: 1-2 spaces become underscores, 3+ spaces become a single
     * dash.
     */
    public String fixSpaces(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int n = text.length();
        int i = 0;

        while (i < n) {
            if (text.charAt(i) == ' ') {
                int start = i;
                // Count consecutive spaces
                while (i < n && text.charAt(i) == ' ') {
                    i++;
                }
                int spaceCount = i - start;

                if (spaceCount > 2) {
                    sb.append("-");
                } else {
                    // Append underscores based on the count (1 or 2)
                    for (int j = 0; j < spaceCount; j++) {
                        sb.append("_");
                    }
                }
            } else {
                sb.append(text.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}
