package day04_Variables;
/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 4;
        double PI = 3.14;
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double perimeter = diameter * radius;
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
