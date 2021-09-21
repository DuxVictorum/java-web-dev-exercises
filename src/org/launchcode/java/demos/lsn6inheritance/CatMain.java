package org.launchcode.java.demos.lsn6inheritance;

public class CatMain {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        boolean x = garfield.isTired();
        System.out.println(x);
        garfield.eat();
        x = garfield.isTired();
        System.out.println(x);
        System.out.println(garfield.isSatisfied());
        System.out.println(garfield.noise());
        garfield.sleep();
        garfield.eat();
        System.out.println(garfield.noise());
    }
}
