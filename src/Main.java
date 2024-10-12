
import Task1.Grades;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        int[] array = {29, 37, 38, 41, 84, 67};
        int[] inssuficientGrades = grades.getInsufficientGrades(array);
        System.out.print("Noten:");
        System.out.println(Arrays.toString(array));
        System.out.print("Nicht ausreichende Noten:");
        System.out.println(Arrays.toString(inssuficientGrades));
        double average = grades.getAverage(array);
        String fixedAverage = String.format("%.2f", average);
        System.out.println("Durchschnittswert: " + fixedAverage);
        System.out.println("Abgerundete Noten:" + Arrays.toString(grades.getRoundedGrades(array)));

    }
}