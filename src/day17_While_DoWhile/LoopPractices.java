package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // best practice
            System.out.println(i);
        }

        System.out.println("---------------------------");

        int j = 1;
        while (j <= 10) { // not a good practice
            System.out.println(j);
            j++;
        }

        System.out.println("---------------------------");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);


    }
}
