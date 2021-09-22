package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    //    Class variables / properties
    private ArrayList<MenuItem> fullMenu = new ArrayList<>();
    private String lastUpdated;
    private LocalDate timeStamp = LocalDate.now();

    //    Constructor
    public Menu (String date) {
        this.lastUpdated = date;
    }

    //    Getters & Setters
    public ArrayList<MenuItem> getFullMenu() { return fullMenu; }
    public String getLastUpdated() { return lastUpdated; }
    private void setLastUpdated(String newUpdated) { this.lastUpdated = newUpdated; }
    public LocalDate getTimeStamp() { return timeStamp; }

    //    Methods
    public void addItem(MenuItem name, String date) {
        if (!isDuplicate(name)) {
            fullMenu.add(name);
            this.lastUpdated = date;
        }
    }
    public void removeItem(MenuItem name, String date) {
        fullMenu.remove(name);
        this.lastUpdated = date;
    }
    public void printMenu() {
        System.out.println("\nHere is our delicious menu: \n");
        for (MenuItem item : this.getFullMenu()) {
            System.out.println(item.toString());
        }
    }
    public boolean isDuplicate(MenuItem itemToCheck) {
        boolean duplicate = false;
        for (MenuItem item : fullMenu) {
            if (itemToCheck.equals(item)) {
                System.out.println("This item is already in the menu.");
                duplicate = true;
                return duplicate;
            }
        }
        return duplicate;
    }

}
