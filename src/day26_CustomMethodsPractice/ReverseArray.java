package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] result = reversArray(arr);

        System.out.println(Arrays.toString(result));
    }

    //reverses the given array, returns a new array
    public static int[] reversArray(int[] array) {

        int[] result = new int[array.length];
        // j = 0; // another option
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
            // result[j++] = array[i]; // another option

        }
        return result;

    }

}
