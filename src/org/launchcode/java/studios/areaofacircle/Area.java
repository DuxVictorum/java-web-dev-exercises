package org.launchcode.java.studios.areaofacircle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        //  Input Validation
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            try {
                double radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("Sorry bud, we need a positive number. ");
                    continue;
                }
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
                break;
            } catch(InputMismatchException e) {
                System.out.println("Enter a number, goofus!");
            }
        } while (true);

    }
}

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double radius;
//
//        //  Input Validation
//        System.out.println("Enter a radius: ");
//        try {
//            radius = input.nextDouble();
//            if (radius < 0) {
//                System.out.println("Sorry bud, we need a positive number.");
//                return;
//            }
//            double area = Circle.getArea(radius);
//            System.out.println("The area of a circle of radius " + radius + " is: " + area);
//        } catch(InputMismatchException e) {
//            System.out.println("Enter a number, goofus!");
//        }
//    }