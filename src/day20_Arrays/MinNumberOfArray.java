package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 100, 0};
        int min = numbers[0]; // 10

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);

    }
}
