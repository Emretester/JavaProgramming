package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue; // Skips
            }
            System.out.println(i); // A B D E
        }

        System.out.println("-------------------------");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) { // 1, 3, 5, 7, 9
                continue; // Skip
            }
            System.out.println(i);
        }

        System.out.println("-------------------------");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) { // 0, 2, 4, 6, 8, 10
                continue; // Skip
            }
            System.out.println(i);
        }


    }
}
