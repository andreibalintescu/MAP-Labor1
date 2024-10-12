
import Task1.Grades;
import Task2.ArrayProcessor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///TASK 1
        Grades grades = new Grades();
        int[] array = {29, 37, 38, 41, 84, 67};
        int[] insufficientGrades = grades.getInsufficientGrades(array);

        System.out.println();
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

        System.out.println();

        ///TASK 2
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] numbers = {4, 8, 3, 10, 17};
        System.out.println(Arrays.toString(numbers));
        //SUBTASK 1
        System.out.println("Maximale Zahl:" + arrayProcessor.getMax(numbers));
        //SUBTASK 2
        System.out.println("Minimale Zahl:" + arrayProcessor.getMin(numbers));
    }
}