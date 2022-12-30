package day17_While_DoWhile;

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        for (int i = 0; i <= 3; i++) {

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
                break;
            } else {
                if (i == 3) {
                    System.out.println("Your account is locked");
                    break;
                }
                if (i == 2) {
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
            }

        }
        scan.close();

    }
}
