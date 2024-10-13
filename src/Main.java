
import Task1.Grades;
import Task2.ArrayProcessor;
import Task3.BigNumberCalculator;

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
        //SUBTASK 3
        System.out.println("Maximale Summe:" + arrayProcessor.getMaxSum(numbers));
        //SUBTASK 4
        System.out.println("Minimale Summe:" + arrayProcessor.getMinSum(numbers));

        System.out.println();

        ///TASK 3
        BigNumberCalculator bigNumberCalculator = new BigNumberCalculator();
        //SUBTASK 1
        char[] num1 = {'1','3','0','0','0','0','0','0','0'};
        char[] num2 = {'8','7','0','0','0','0','0','0','0'};
        System.out.println(bigNumberCalculator.addBigNumbers(num1, num2));
        //SUBTASK 2
        char[] num3 = {'8','3','0','0','0','0','0','0','0'};
        char[] num4 = {'5','4','0','0','0','0','0','0','0'};
        System.out.println(bigNumberCalculator.subtractBigNumbers(num3, num4));
        //SUBTASK 3
        char[] num5 = {'5','3','6','0','0','0','0','0','0'};
        int multiplier = -1;
        System.out.println(bigNumberCalculator.multiplyBigNumbers(num5, multiplier));
        //SUBTASK 4
        char[] num6 = {'2','3','6','0','0','0','0','0','0'};
        int divisor = 2;
        System.out.println(bigNumberCalculator.divideBigNumbers(num6, divisor));
    }
}