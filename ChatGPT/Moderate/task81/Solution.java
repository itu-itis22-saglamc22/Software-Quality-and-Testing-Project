package task81;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> numericalLetterGrade(List<Double> grades) {
        List<String> result = new ArrayList<>();

        if (grades == null || grades.isEmpty()) {
            return result;
        }

        for (double gpa : grades) {
            if (gpa == 4.0) {
                result.add("A+");
            } else if (gpa > 3.7) {
                result.add("A");
            } else if (gpa > 3.3) {
                result.add("A-");
            } else if (gpa > 3.0) {
                result.add("B+");
            } else if (gpa > 2.7) {
                result.add("B");
            } else if (gpa > 2.3) {
                result.add("B-");
            } else if (gpa > 2.0) {
                result.add("C+");
            } else if (gpa > 1.7) {
                result.add("C");
            } else if (gpa > 1.3) {
                result.add("C-");
            } else if (gpa > 1.0) {
                result.add("D+");
            } else if (gpa > 0.7) {
                result.add("D");
            } else if (gpa > 0.0) {
                result.add("D-");
            } else {
                result.add("E");
            }
        }

        return result;
    }
}