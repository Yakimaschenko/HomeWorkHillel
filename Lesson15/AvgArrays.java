package Lesson15;

import java.util.Arrays;

public class AvgArrays {

    public double avgAverage(int[] myArray) {
        double average = 0;

        for (int j : myArray) {
            average += j;
        }
        double result = average / myArray.length;

        System.out.println("Среднее арифметическое  = " + Arrays.toString(myArray) + " является " + result);
        return result;

    }

    public static boolean isSquare (Object[][] matrix) {
        for (Object[] row : matrix) {
            if (matrix.length != row.length) return false;
        }
        return true;

    }
}





