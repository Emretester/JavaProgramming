package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Phyton"); // "Phyton is fun, I love learning Phyton"
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email); // want gmail

        String sentence = "Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton Phyton Phyton";
        sentence = sentence.replace("Phyton", "").replace("  ", "");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat"); // "Cat ...."
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e"); // "Jeve
        System.out.println("s3 = " + s3);

        System.out.println("---------------------------------------");

        String result = "Java Java Java";

        // result = result.replace("Java" , "Phyton");
        result = result.replaceFirst("Java", "Phyton");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        String result3 = "Java";
        // result3 = result3.replaceFirst("a", "o"); // "Jova"
        result3 = result3.replaceFirst("va", "vo"); // "Javo"
        System.out.println("result3 = " + result3);






    }
}
