package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Ali";
        String lastName = "Veli";
        int age = 29;
        String companyName = "Apple Inc.";
        String jobTitle = "SDET";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Full name of the person is ___
        System.out.println("Full name of the person is " + fullName);

        // ___ is ___ years old
        System.out.println(fullName +" is " + age + " old");

        // FullName is JobTitle, works at CompanyName, and FullName's salary is Salary

        System.out.println(fullName + " is an " + jobTitle + ", works at "
                + companyName + ", and " + fullName + "'s salary is $" + salary);
    }
}
