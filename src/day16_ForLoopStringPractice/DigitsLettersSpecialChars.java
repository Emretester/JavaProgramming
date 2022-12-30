package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "şkş54435nk&//()=   sdgf8f945^^+TDfmosfksdf";

        String digits = ""; // 12345
        String letters = ""; // CydeoSchoolWoodenSpoon
        String specialChars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char ch = str.charAt(i); // ch:every single character that we have in str
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                letters += ch;
            }else {
                if (ch !=' ') { // if the special character is not a space
                    specialChars += ch;
                }
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
