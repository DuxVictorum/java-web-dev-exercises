package exercises.technology;

import java.util.ArrayList;
import java.util.Arrays;

public class Laptop extends Computer{

    private String laptopName;
    private double laptopScreenSize;
    private double laptopMaxStorageGB;
    private String laptopOsType;
    private double laptopCurrentStorageGB;
    private boolean laptopComputerOn;
    private ArrayList<String> officeApps;
    private ArrayList<String> laptopPrograms;
    private Integer uniqueID;

    public Laptop (String name, double screenSize, double maxStorageGB, String osType) {
        super(name, screenSize, maxStorageGB, osType);
        this.laptopName = name;
        this.laptopScreenSize = screenSize;
        this.laptopMaxStorageGB = maxStorageGB;
        this.laptopOsType = osType;
        this.laptopCurrentStorageGB = 80.0;
        this.laptopPrograms = new ArrayList<>(Arrays.asList("Dungeon Of The Endless"));
        this.laptopComputerOn = false;
        this.officeApps = new ArrayList<>(Arrays.asList("Word", "Excel", "PowerPoint"));
        for (String oApp : this.officeApps) {
            laptopPrograms.add(oApp);
        }
        this.uniqueID = AbstractEntity.lastID + 1;
        AbstractEntity.lastID += 1;
    }
    public ArrayList<String> getOfficeApps() { return this.officeApps; }
    public void runOffice(String chosenApp) {
        System.out.println("Enjoying using " + chosenApp + "! May it never crash on you.");
    }
    @Override
    public Integer getUniqueID() { return this.uniqueID; }
    @Override
    public String getName() { return laptopName; }
    @Override
    public double getCurrentStorageGB() { return laptopCurrentStorageGB; }
    @Override
    public ArrayList<String> getPrograms() { return laptopPrograms; }
//    @Override
//    public void printPrograms(ArrayList<String> programsArr) {
//        System.out.println("\nYour computer currently has the following programs: ");
//        for (String program : programsArr) {
//            System.out.println(program);
//        }
//    }
}
