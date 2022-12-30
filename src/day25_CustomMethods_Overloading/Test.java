package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------");

        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-------------------------");

        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("-------------------------");

        String word1 = "Java";
        String word2 = "avaJ";

        boolean anagram = StringUtility.anagram(word1, word2);

        System.out.println("anagram = " + anagram);

        System.out.println("-------------------------");

        String word3 = "aaaabbbbccccc";

        word3 = StringUtility.removeDublicates(word3);

        System.out.println(word3);

    }
}
