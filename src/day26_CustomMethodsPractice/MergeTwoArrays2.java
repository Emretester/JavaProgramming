package day26_CustomMethodsPractice;


import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] aar1 = {1, 2, 3, 4};
        int[] aar2 = {5, 6, 7, 8};

        int[] aar3 = merge(aar1, aar2);

        System.out.println(Arrays.toString(aar3));

        System.out.println("-----------------------------");

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"D", "E", "F"};

        String[] result = ArraysUtility.merge(a1, a2);

        System.out.println(Arrays.toString(result));


    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }
}
