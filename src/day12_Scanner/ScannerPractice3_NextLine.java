package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullname = input.nextLine(); // Wooden SpoonEnter

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 24

        input.nextLine(); // Enter

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine(); // Enter

        System.out.println("fullname = " + fullname);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
