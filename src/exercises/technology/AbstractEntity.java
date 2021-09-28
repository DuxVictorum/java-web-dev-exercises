package exercises.technology;

import java.util.ArrayList;

public abstract class AbstractEntity {
    static Integer lastID = 0;
    static ArrayList<Integer> idList;

//    public AbstractEntity(){}

//    public static Integer getNewID() {
//        Integer newID = lastID + 1;
//        lastID = newID;
//        return newID;
//    }
    public static Integer getLastID() { return lastID; }



}

