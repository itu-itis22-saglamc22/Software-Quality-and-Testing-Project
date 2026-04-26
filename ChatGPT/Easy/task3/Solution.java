package task3;

import java.util.List;

class Solution {
    public boolean belowZero(List<Integer> operations) {
        if (operations == null || operations.isEmpty()) {
            return false;
        }

        int balance = 0;

        for (int op : operations) {
            balance += op;
            if (balance < 0) {
                return true;
            }
        }

        return false;
    }
}