package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.HashMap;



public class Menu {
    public static void main(String[] args) {
        //    Class variables / properties
        ArrayList<MenuItem> fullMenu = new ArrayList<>();
        String lastUpdated;

        MenuItem pizza12 = new MenuItem("12-inch pizza", "main course", 12.95, false);
        System.out.println(pizza12.getDescription());
    }
}
