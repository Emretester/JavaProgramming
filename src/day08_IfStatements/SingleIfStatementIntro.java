package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 300;
        /*
        System.out.println("Odd Number");

        System.out.println("Even Number");
        */

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber; // not even number

        if (evenNumber){ // true
            System.out.println(number + " is even number");
        }

        if (oddNumber){ // false
            System.out.println(number + " is odd number");
        }

        System.out.println("---------------------------------");

        int n = 100;

        // positive
        if (n>0){ //if the n is greater than zero, then it is positive
            System.out.println(n + " is positive");
        }

        // negative
        if (n<0){//if the n is less than zero, then it is negative
            System.out.println(n + " is negative");
        }

        // zero
        if (n==0){//if the n is  zero, then it is zero
            System.out.println(n + " is zero");
        }

    }
}
