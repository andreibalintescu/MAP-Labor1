
import Task1.Grades;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        int[] array = {25, 15, 80, 45};
        int[] inssuficientGrades = grades.getInsufficientGrades(array);
        System.out.print("Noten:");
        System.out.println(Arrays.toString(array));
        System.out.print("Nicht ausreichende Noten:");
        System.out.println(Arrays.toString(inssuficientGrades));
        double average = grades.getAverage(array);
        System.out.println("Durchschnittswert: " + average);
    }
}