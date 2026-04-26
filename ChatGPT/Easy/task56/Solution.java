package task56;

class Solution {
    public boolean correctBracketing(String brackets) {
        if (brackets == null || brackets.isEmpty()) {
            return true;
        }

        int depth = 0;

        for (char b : brackets.toCharArray()) {
            if (b == '<') {
                depth++;
            } else if (b == '>') {
                depth--;
            }

            if (depth < 0) {
                return false;
            }
        }

        return depth == 0;
    }
}