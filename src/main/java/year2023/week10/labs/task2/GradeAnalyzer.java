package year2023.week10.labs.task2;

import java.util.List;

public class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void printSummary() {
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}
