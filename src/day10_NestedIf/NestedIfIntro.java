package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 75;

        if (score >= 0 && score <= 100) { // if the score is valid

            if (score >= 60) { // if student pass the exam
                System.out.println("Passed");
            } else { // if the student failed the exam
                System.out.println("Failed");
            }

        } else { // if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("--------------------------------");

        int age = 25;
        boolean hasId = false;

        if (hasId) { // if the person has ID

            if (age >= 21) { // if the person is 21 years or older
                System.out.println("Eligible to buy alcohol");
            } else { // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        }else {
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("-----------------------------------------");

        int number = 2;

        if (number >= 1 && number <= 7) { // if the number is a valid number
            // 7 options
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wdnesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else { // if the number is not valid
            System.out.println("Invalid Number");
        }



    }
}
