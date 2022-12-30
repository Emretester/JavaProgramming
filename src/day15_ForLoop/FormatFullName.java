package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "JoSh",
                lastName = "smiTh";

        //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); // char become to string
            //              "C"                              +          "ydeo"

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
    }
}

/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */