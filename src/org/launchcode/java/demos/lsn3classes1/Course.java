package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseNum;
    private String courseTitle;
    private int credits;
    private int maxStudents;
    private Teacher courseTeacher;
    private ArrayList<Student> students;

    public Course(String courseNum, String courseTitle, int credits, int maxStudents) {
        this.courseNum = courseNum;
        this.courseTitle = courseTitle;
        this.credits = credits;
        this.maxStudents = maxStudents;
    }

    public void assignTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
}
