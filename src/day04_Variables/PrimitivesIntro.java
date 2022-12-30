package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age: 38 years old (byte: -128 to 127)
        byte age = 39;

        // weight: 160 pounds (short: -32768 to 32767)
        short weight = 160;

        // salary: 100000 $ (int: -2147483648 to 2147483647)
        int salary = 100000;

        // from byte to int default is int so add from long add l or L
        long asset = 3333333333L;

        // tax: 0.26
        double tax = 0.26;

        // default is double so add f or F to float
        float PI = 3.14F;

    /*
    use int for integer numbers
    use double for floating point numbers
     */

        char ch1 = '#';
        char ch2 = 35;
        char ch3 = 35000;
        char gender = 'F';
        char grade = 'A';
        char yesNo = 'Y';
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);
        System.out.println("gender = " + gender);
        System.out.println("grade = " + grade);
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100<300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

    }

}

