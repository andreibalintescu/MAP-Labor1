
import Task1.Grades;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///TASK 1
        Grades grades = new Grades();
        int[] array = {29, 37, 38, 41, 84, 67};
        int[] insufficientGrades = grades.getInsufficientGrades(array);

        System.out.print("Noten:");
        System.out.println(Arrays.toString(array));
        //SUBTASK 1
        System.out.print("Nicht ausreichende Noten:");
        System.out.println(Arrays.toString(insufficientGrades));
        //SUBTASK 2
        double average = grades.getAverage(array);
        String fixedAverage = String.format("%.2f", average);
        System.out.println("Durchschnittswert: " + fixedAverage);
        //SUBTASK 3
        System.out.println("Abgerundete Noten:" + Arrays.toString(grades.getRoundedGrades(array)));
        //SUBTASK 4
        System.out.println("Maximale Abgerundete Note:" + (grades.getMaxRoundedGrade(array)));

    }
}