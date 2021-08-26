package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the area of a rectangle.");
        System.out.println("What is the length in units?");
        int length = input.nextInt();
        System.out.println("The length is " + length + " units. What is the width?");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of your rectangle is " + area + " units.");
    }
}
