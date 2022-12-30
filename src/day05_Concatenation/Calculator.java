package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int subraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int dividion = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subraction);
        System.out.println(firstNumber + " x " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + dividion);

    }
}
