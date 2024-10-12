package Task1;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    public int[] getInsufficientGrades(int[] grades) {
        List<Integer> insufficientGradesList = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 40) {
                insufficientGradesList.add(grade);
            }
        }

        int[] insufficientGrades = new int[insufficientGradesList.size()];
        for (int i = 0; i < insufficientGradesList.size(); i++) {
            insufficientGrades[i] = insufficientGradesList.get(i);
        }

        return insufficientGrades;
    }

    public double getAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int roundedGrade = ((grades[i] / 5) + 1) * 5;
                if (roundedGrade - grades[i] < 3)
                    roundedGrades[i] = roundedGrade;
                else
                    roundedGrades[i] = grades[i];
            } else
                roundedGrades[i] = grades[i];

        }
        return roundedGrades;
    }

    public int getMaxRoundedGrade(int[] grades) {
        int max = 0;
        for (int grade : grades) {
            if (grade > max)
                max = grade;
        }
        return ((max / 5) + 1) * 5;
    }
}
