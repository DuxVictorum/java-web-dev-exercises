package org.launchcode.java.studios.restaurant;

public class MenuItem {

//    Class variables
    private String description;
    private String category;
    private double price;
    private boolean newItem;

//    Constructors
    public MenuItem(String description, String category, double price, boolean newItem) {
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
    }
    public MenuItem(String description, String category) {
        this(description, category, 0.0, false);
    }

//    Getter & Setter Salad
    public String getDescription() { return this.description; }
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getCategory() { return this.category; }
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public double getPrice() { return this.price; }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public boolean isNewItem() { return this.newItem; }
    public void setNewItem(boolean isNew) {
        this.newItem = isNew;
    }

    //    Methods
    @Override
    public String toString() {
        return this.description + " (" + this.category + ")" +
                "\n\tPrice: " + this.price;
    }
    @Override
    public boolean equals(Object toCompare) {
        if (toCompare == this) { return true; }
        else if (toCompare == null) { return false; }
        else if (toCompare.getClass() != this.getClass()) { return false; }
        MenuItem theItem = (MenuItem) toCompare;
        return theItem.getDescription() == this.getDescription() && theItem.getPrice() == this.getPrice();
    }

}
