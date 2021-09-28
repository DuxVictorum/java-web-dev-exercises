package exercises.technology;

import java.util.ArrayList;

public class Computer extends AbstractEntity{
    private String name;
    private double screenSize;
    private double maxStorageGB;
    private double currentStorageGB;
    private String osType;
    private ArrayList<String> programs;
    private boolean computerOn;
    private Integer uniqueID;

    public Computer (String name, double screenSize, double maxStorageGB, String osType) {
        this.name = name;
        this.screenSize = screenSize;
        this.maxStorageGB = maxStorageGB;
        this.osType = osType;
        this.currentStorageGB = 0.0;
        this.programs = new ArrayList<>();
        this.computerOn = false;
        this.uniqueID = AbstractEntity.lastID + 1;
        AbstractEntity.lastID += 1;
    }

//    Getter & Setter Salad
    public String getName() { return name; }
    public void setName(String aName) { name = aName; }
    public double getScreenSize() { return screenSize; }
    public double getMaxStorageGB() { return maxStorageGB; }
    public void setMaxStorageGB(double aSize) { maxStorageGB = aSize; }
    public double getCurrentStorageGB() { return currentStorageGB; }
    public void setCurrentStorageGB(double newCurrentStorage) { currentStorageGB = newCurrentStorage; }
    public String getOsType() { return osType; }
    public void setOsType(String newOS) { osType = newOS; }
    public ArrayList<String> getPrograms() { return programs; }
    public Integer getUniqueID() { return this.uniqueID; }

    //    Methods
    public void printPrograms(ArrayList<String> programsArr) {
        System.out.println("\nYour computer currently has the following programs: ");
        for (String program : programsArr) {
            System.out.println(program);
        }
    }

    public void turnOn() {
        if (!computerOn) {
            this.computerOn = true;
            System.out.println("Your computer is now on.");
        } else {
            System.out.println("Your computer is already on, bread-for-brains.");
        }
    }

    public void turnOff() {
        if (computerOn) {
            this.computerOn = false;
            System.out.println("Your computer is now off.");
        } else {
            System.out.println("Your computer is already off, you hoober hanky.");
        }
    }

    public void addProgram(String app, double size) {
        if (computerOn) {
            programs.add(app);
            currentStorageGB += size;
        } else {
            System.out.println("You need to turn on your computer first!");
        }
    }

    public void deleteProgram(String app, double size) {
        programs.remove(app);
        currentStorageGB -= size;
    }

}
