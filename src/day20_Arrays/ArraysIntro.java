package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5]; // default value is null for String. 0 for byte, short, int, long. 0.0 for double and float. false for boolean

        myGroup[0] = "Ali";
        myGroup[1] = "Veli";
        myGroup[2] = "";
        myGroup[3] = "Eda";
        myGroup[4] = "Mert";
        // myGroup [5]= "Cem"; Can not be stored because max index nuber is 4
        // myGrouo [-1]= "Mike"; Can not be stored because min index nuber is 0

        // System.out.println(myGroup); // writes hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 0;

        if (number < 1 || number > 7) {
            System.out.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number - 1]);


    }
}
