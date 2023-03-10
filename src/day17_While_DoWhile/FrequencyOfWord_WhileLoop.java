package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {


        String str = "Java Java Phyton Phyton";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------------------");

        String sentence = "cat cat Cat cat dog dog dog dog cAt cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

        System.out.println("------------------------------");

        String s = "java java java phyton phyton phyton";

        int countJava = 0;
        int countPhyton = 0;

        while (s.contains("java") || s.contains("phyton")) {

            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("phyton")) {
                s = s.replaceFirst("phyton", "");
                countPhyton++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);


    }
}
