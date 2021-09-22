package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        //        Make a blank menu
        Menu ourMenu = new Menu("02/18/21");

        //        Make several menu items
        MenuItem pizza12 = new MenuItem("12-inch pizza", "main course", 12.95, false);
        MenuItem pizza16 = new MenuItem("16-inch pizza", "main course", 15.95, false);
        MenuItem onionRings = new MenuItem("Onion Rings", "appetizer", 3.95, false);
        MenuItem cheeseCake = new MenuItem("Caramel Cheesecake", "dessert", 4.55, true);

        //      Add items to the menu
        ourMenu.addItem(pizza12, "02/18/21");
        ourMenu.addItem(pizza16, "04/05/21");
        ourMenu.addItem(onionRings, "04/05/21");
        ourMenu.addItem(cheeseCake, "04/15/21");

        //      Print out individual menu items THEN full menu
//        System.out.println(pizza12.toString());
//        System.out.println(pizza16.toString());
        ourMenu.printMenu();
        ourMenu.removeItem(pizza16, "05/22/21");
        ourMenu.printMenu();
        System.out.println("Menu last updated: " + ourMenu.getLastUpdated());
        ourMenu.addItem(pizza12, "05/30/21");
        MenuItem yummyRings = new MenuItem("Onion Rings", "appetizer", 3.95, false);
        ourMenu.addItem(yummyRings, "06/25/21");
        System.out.println(ourMenu.getTimeStamp());
    }
}
