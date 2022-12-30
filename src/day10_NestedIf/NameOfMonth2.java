package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {

        int n = 5;

       String name = (n==1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "April"
        :(n==5)? "May" :(n==6)? "Jun" :(n==7)? "Jul" :(n==8)? "Aug"
        :(n==9)? "Sep" :(n==10)? "Oct" :(n==11)? "Nov" : "Dec";

        System.out.println(name);

        /*
        int number = 2;
        String result = "";

        if (number >= 1 && number <= 12) { // if the number is valid

            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "Fabruary";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            }else if (number == 10) {
                result = "October";
            }else if (number == 11) {
                result = "November";
            }else{
                result = "December";
            }

        } else { // if the number is not valid
            result = "Invalid Number";
        }

        System.out.println(result);


         */


    }
}
