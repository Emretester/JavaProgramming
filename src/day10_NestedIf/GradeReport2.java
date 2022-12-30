package day10_NestedIf;

public class GradeReport2 {
    
    public static void main(String[] args) {

        /*
        90 - 100 : Excellent
        80 - 89 : Great
        70 - 79 : Good
        60 - 69 : Passed
        0 -  59 : Failed
         */

        int s = 84;

        if (s >= 0 && s <= 100){

            if (s >= 90){
                System.out.println("Excellent");
            } else if (s >= 80) {
                System.out.println("Great");
            } else if (s >= 70) {
                System.out.println("Good");
            } else if (s >= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------");

        String result = ""; // temporary

        if (s >= 0 && s <= 100){

            if (s >= 90){
                result = "Excellent";
            } else if (s >= 80) {
                result = "Great";
            } else if (s >= 70) {
                result = "Good";
            } else if (s >= 60) {
                result = "Passed";
            }else {
                result = "Failed";
            }
        }else {
            result = "Invalid Score";
        }

        System.out.println(result);
        
        System.out.println("---------------------------");
   
        // solution 2: use ternaries ONLY

        String result2 = (s>=0 && s<=100)? (s>=90)? "Excellent" :(s>=80)? "Great" :(s>=70)?
                "Good" :(s>=60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result2);

        System.out.println("---------------------------");

        // mix solution

        if (s >= 0 && s <= 100){
            result2 = (s>=90)? "Excellent" :(s>=80)? "Great" :(s>=70)?
                    "Good" :(s>=60)? "Passed" : "Failed";
        }else {
            result2 = "Invalid Score";
        }

        System.out.println(result2);

    }

}
