package day07_Operators;

public class ArithmeticOperators {
    public static void main (String[] args){
        int num1 = 25;
        int num2 = 3;

        int division = num1 / num2; // division variable contains the result of num1 divided by num2
        int remainder = num1 % num2; // remainder variable contains the remainder of num1 divided to num2

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);
    }
}