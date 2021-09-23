package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //  Order of names BEFORE the sort
        System.out.println("\nBefore the sort:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        //  Order of names AFTER the sort
        System.out.println("\nAfter the sort:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator priceCompare = new ConeComparator();
        cones.sort(priceCompare);
        System.out.println("\nSorted by price:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + "\t" + cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
