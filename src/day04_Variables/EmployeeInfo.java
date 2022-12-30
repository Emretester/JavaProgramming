package day04_Variables;
/*
6. Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)

 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Emre";
        int age = 39;
        char gender = 'M';
        String company = "Apple Inc.";
        String jobtitle = "SDET";
        double yearsOfExperience = 3.5;
        int salary = 240000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeID = "123asd";
        String SSN = "123456789";

        System.out.println("name = " + name);
        System.out.println("employeeID = " + employeeID);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("jobtitle = " + jobtitle);
        System.out.println("company = " + company);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("salary = $" + salary);
        System.out.println("isMarried = " + isMarried);
        System.out.println("SSN = " + SSN);

    }
}
