package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "AABCCD";
        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (starting from 0)
            char ch = str.charAt(i); // ch: each characters of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and last index number of the character then the character is unique
                result += ch;
            }
        }
        System.out.println(result);


    }
}
