package exercises.technology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SmartPhone extends Computer {

    private double currentStorageGB;
    private HashMap<String, String> callLog;
    private boolean phoneOn;
    private Integer uniqueID;

    public SmartPhone (String name, double screenSize, double maxStorageGB, String osType) {
        super(name, screenSize, maxStorageGB, osType);
        this.callLog = new HashMap<>();
        this.currentStorageGB = 12.0;
        this.phoneOn = false;
//        this.uniqueID = AbstractEntity.lastID + 1;
//        AbstractEntity.lastID += 1;
    }
//  Getter & Setter Salad
    @Override
    public double getCurrentStorageGB() { return this.currentStorageGB; }
    public boolean getPhoneOn() { return this.phoneOn; }
    public HashMap<String, String> getCallLog() { return callLog; }
    @Override
    public Integer getUniqueID() { return this.uniqueID; }

//  Instance Methods
    @Override
    public void turnOn() {
        if (!phoneOn) {
            this.phoneOn = true;
            System.out.println("Your computer is now on.");
        } else {
            System.out.println("Your computer is already on, bread-for-brains.");
        }
    }
    @Override
    public void turnOff() {
        if (phoneOn) {
            this.phoneOn = false;
            System.out.println("Your computer is now off.");
        } else {
            System.out.println("Your computer is already off, you hoober hanky.");
        }
    }
    public void makeCall (String phoneNum, String msg) {
        if (phoneOn) {
            System.out.println("You just made a call to " + phoneNum + ".");
            this.callLog.put(phoneNum, msg);
        } else {
            System.out.println("Please turn your phone on first.");
        }
    }

    public void printCallLog (HashMap<String, String> log) {
        System.out.println("\nHere is the list of calls made from this phone: ");
        for (Map.Entry<String, String> call : log.entrySet()) {
            System.out.println(call.getKey() + "\t" + call.getValue());
        }
    }

}
