package task110;

import java.util.List;

class Solution {
    public String exchange(List<Integer> lst1, List<Integer> lst2) {
        int odd = 0;
        int even = 0;

        for (int x : lst1) {
            if (x % 2 != 0) {
                odd++;
            }
        }

        for (int x : lst2) {
            if (x % 2 == 0) {
                even++;
            }
        }

        return even >= odd ? "YES" : "NO";
    }
}