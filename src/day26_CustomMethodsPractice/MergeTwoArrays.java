package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] aar1 = {1, 2, 3, 4};
        int[] aar2 = {5, 6, 7, 8};

        int[] aar3 = merge(aar1, aar2);

        System.out.println(Arrays.toString(aar3));

    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }
}
