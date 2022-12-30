package day17_While_DoWhile;

public class RemoveDublicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = ""; // "ABC

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i); // String because contains() method cannot take char
            if (result.contains(ch)) { //If the result already contains the character
                continue; // skips
            }
            result += ch;
        }
        System.out.println(result);

    }
}
