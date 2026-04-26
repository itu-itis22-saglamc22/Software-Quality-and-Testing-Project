package task110;

import java.util.*;

class Solution {
    /**
     * Determines if lst1 can be made entirely even by exchanging elements with
     * lst2.
     */
    public String exchange(List<Integer> lst1, List<Integer> lst2) {
        int oddCountInLst1 = 0;
        int evenCountInLst2 = 0;

        // Count how many odd numbers need to be removed from lst1
        for (int num : lst1) {
            if (num % 2 != 0) {
                oddCountInLst1++;
            }
        }

        // Count how many even numbers are available in lst2 to swap in
        for (int num : lst2) {
            if (num % 2 == 0) {
                evenCountInLst2++;
            }
        }

        // If we have enough even numbers in lst2 to replace every odd in lst1
        return (evenCountInLst2 >= oddCountInLst1) ? "YES" : "NO";
    }
}