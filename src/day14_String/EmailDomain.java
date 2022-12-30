package day14_String;

public class EmailDomain {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        // domain:
        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        System.out.println("-----------------------------------");

        String str1 = "Java is fun, Java is cool";

        //             0123456789
        //
        String s1 = str1.substring(0, 10 + 1); // Java is fun

        int beg = str1.lastIndexOf("J");

        String s2 = str1.substring(beg); // Java is cool

        System.out.println(s1);
        System.out.println(s2);

        String str2 = "Java is fun, Java is cool, I love Java";

        int beg1 = str2.indexOf(" J") +1;
        int end = str2.lastIndexOf(",");

        String s3 = str2.substring(beg1, end);
        System.out.println(s3);

        System.out.println("-------------------------------------");

        String s4 = str2.substring(str2.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);


    }

}
