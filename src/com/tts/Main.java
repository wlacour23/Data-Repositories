package com.tts;
import java.util.Arrays;
import static java.lang.Double.valueOf;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        double[ ] exampleArray = {1, 5, 6, 5, 4, 1};
        int [ ] exampleArrayTwo = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = 1;
            }
        }

        System.out.println(index);

        System.out.println(sumArray(exampleArrayTwo));

    }

    public static double[] toPower(int size, int power) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.pow((Double.valueOf(i)), Double.valueOf(power));
        }
        return result;
    }

    public static int sumArray(int[] sum) {
        int add = 0;
        for (int i = 0; i < sum.length; i++) {
            add += sum[i];
        }
        return add;
    }
}