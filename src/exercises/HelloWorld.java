package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      Ask user for name
        System.out.println("Hello, what is your name? ");
//      Store user input
        String name = input.nextLine();

//      Display personalized greeting
        System.out.println("Hello there, " + name + ".");
        input.close();
    }
}
