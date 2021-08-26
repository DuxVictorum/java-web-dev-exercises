package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas have you used? ");
        double gasGallons = input.nextDouble();
        double mpg = miles / gasGallons;
        System.out.println("Your miles per gallon = " + mpg + " mpg.");
    }
}
