package day04_Variables;
/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */

public class Rectangle {
    public static void main(String[] args) {

        double width = 8.5;
        double length = 10.5;
        double area = width * length;
        double perimeter = 2 * (width + length);
        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
