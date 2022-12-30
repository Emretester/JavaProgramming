package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 7;
        // long number = 9L;
        // float number = 9F;
        // double number = 9D;
        // boolean number = true;

        switch (number){ // 1,2,3,4,5,6,7
           case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuersday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break; // it isn't needed in the last block actually
        }


    }

}
