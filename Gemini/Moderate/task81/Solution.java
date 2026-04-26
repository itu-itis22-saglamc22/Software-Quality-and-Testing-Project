package task81;

import java.util.*;

class Solution {
    /**
     * Converts a list of GPAs to letter grades based on defined thresholds.
     */
    public List<String> numericalLetterGrade(List<Double> grades) {
        List<String> letterGrades = new ArrayList<>();
        if (grades == null) {
            return letterGrades;
        }

        for (double gpa : grades) {
            if (gpa == 4.0) {
                letterGrades.add("A+");
            } else if (gpa > 3.7) {
                letterGrades.add("A");
            } else if (gpa > 3.3) {
                letterGrades.add("A-");
            } else if (gpa > 3.0) {
                letterGrades.add("B+");
            } else if (gpa > 2.7) {
                letterGrades.add("B");
            } else if (gpa > 2.3) {
                letterGrades.add("B-");
            } else if (gpa > 2.0) {
                letterGrades.add("C+");
            } else if (gpa > 1.7) {
                letterGrades.add("C");
            } else if (gpa > 1.3) {
                letterGrades.add("C-");
            } else if (gpa > 1.0) {
                letterGrades.add("D+");
            } else if (gpa > 0.7) {
                letterGrades.add("D");
            } else if (gpa > 0.0) {
                letterGrades.add("D-");
            } else {
                letterGrades.add("E");
            }
        }
        return letterGrades;
    }
}