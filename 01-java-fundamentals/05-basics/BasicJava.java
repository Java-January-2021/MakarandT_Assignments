import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void main(String[] args) {

        // Print 1-255
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
        // Print odd numbers between 1-255
        for (int i = 1; i <= 255; i = i + 2) {
            System.out.println(i);
        }
        // Print Sum
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum = sum + i;
            System.out.println(" New number: " + i + " Sum " + sum);
        }
        // Iterating through an array
        int[] X = { 1, 3, 5, 7, 9, 13 };
        for (int j = 0; j < X.length; j++) {
            System.out.println(X[j]);

        }
        // Find Max
        int[] Y = { 1, -3, 0, -7, -9, -13 };
        int Max = Y[0];
        for (int i = 1; i < Y.length; i++) {
            if (Y[i] > Max) {
                Max = Y[i];
            }
        }

        // Get Average
        int sum1 = 0;
        int[] Z = { 2, -15, 3 };
        for (int i = 0; i < Z.length; i++) {
            sum1 = sum1 + Z[i];
            System.out.println(sum1);
        }
        System.out.println("MAX value in array= " + Max);
        System.out.println("Average value of array= " + (sum1 / Z.length));
        System.out.println("Odd Array method" + OddNumber());
        // int Y = 3;
        int[] arr = { 1, 3, 5, 7 };
        System.out.println(GreaterThanY(arr, 1));
        int[] arr1 = { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(squareTheValue(arr1)));
        int[] arr2 = { 1, -2, 3, -4 };
        System.out.println(Arrays.toString(EliminateNegNum(((arr2)))));
        int[] arr3 = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(MaxMinAvg(((arr3)))));
        int[] arr4 = { 1, 5, 10, 7, -2 };
        System.out.println(Arrays.toString(shiftArray(((arr4)))));

    }

    // Array with Odd Numbers

    public static ArrayList<Integer> OddNumber() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++) {
            if (i % 2 != 0) {
                myArray.add(i);
            }
        }
        // System.out.println(myArray);
        return myArray;
    }

    // Greater Than Y

    public static int GreaterThanY(int[] arr, int Y) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > Y) {
                count++;
            }
        }
        // System.out.println(count);
        return count;

    }

    // Square the values
    public static int[] squareTheValue(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] * arr1[i];
            // System.out.println(arr1[i]);
        }
        return arr1;
    }

    // Eliminate Negative Numbers
    public static int[] EliminateNegNum(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0) {
                arr2[i] = 0;
            }
        }
        return arr2;
    }

    // Max, Min, and Average
    public static int[] MaxMinAvg(int[] arr3) {
        int result[] = {};
        result = new int[3];
        int Max = arr3[0];
        int Min = arr3[0];
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > Max) {
                Max = arr3[i];
            }

            if (arr3[i] < Min) {
                Min = arr3[i];
            }
            sum = arr3[i] + sum;

        }
        int Avg = (sum) / (arr3.length - 1); // <-- TODO fix the type
        System.out.println(Max);
        result[0] = Max;
        result[1] = Min;
        result[2] = Avg;
        return result;

    }

    // Shifting the Values in the Array
    public static int[] shiftArray(int[] arr4) {
        for (int i = 1; i < arr4.length ; i++) {
            arr4[i - 1] = arr4[i];
            System.out.println(arr4[i - 1]);
        }
        arr4[arr4.length - 1] = 0;
        return arr4;
    }

}
