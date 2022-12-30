package day16_ForLoopStringPractice;

public class RemoveDublicates {

    public static void main(String[] args) {

        String str = "aabbcc";
        String result = "";// abc

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i); // represents each Character of str
            if (!result.contains(ch)) { // if the character is not contained in the result the character will be added to the result
                result += ch;
            }
        }
        System.out.println(result); // abc


    }
}

/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */