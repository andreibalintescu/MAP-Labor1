package Task1;

public class Grades {
    public int[] getInsufficientGrades(int[] grades) {
        int[] insufficientGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40)
                insufficientGrades[i] = grades[i];


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
}
