package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Cydeo", "school");

        System.out.println("--------------------------");

        domain("cydeo.school@gmail.com");

        System.out.println("--------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("--------------------------");

        nameofMonth(12);

        System.out.println("--------------------------");

        daysInMonth(6);

    }

    // 1. Create a method that can display the initials of the person

    public static void initials(String firstName, String secondName) {

        String initial = firstName.charAt(0) + "." + secondName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);

    }

    // 2. Create a method that can display the domain of the email

    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    // 3. Create a method that can display the name of the month based on the given number to the method

    public static void nameofMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method

    public static void daysInMonth(int number) {

        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
            System.out.println("31");
        }else if (number==4||number==6||number==9||number==11){
            System.out.println("30");

        }else{
            System.out.println("28");
        }
    }

}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


                        */