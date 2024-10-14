package Task2;

public class ArrayProcessor {
    public int getMin(int[] array) {
        int min = array[0]; // Start with first Element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int getMax(int[] array) {
        int max = array[0]; // Start with first Element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int getMaxSum(int[] array) {
        int min = getMin(array); // Calls getMin method for efficiency
        if (array.length == 1) return min;
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum - min;
    }

    public int getMinSum(int[] array) {
        int max = getMax(array); // Calls getMax method for efficiency
        if (array.length == 1) return max;
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum - max;
    }
}
